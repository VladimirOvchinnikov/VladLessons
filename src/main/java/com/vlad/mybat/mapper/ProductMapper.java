package com.vlad.mybat.mapper;

import com.vlad.mybat.model.Product;
import com.vlad.mybat.util.Filter;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductMapper {
    @Insert("insert into products (name, company_id) values (#{product.name, jdbcType=VARCHAR}, #{product.companyId, jdbcType=INTEGER})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "product.id")
    void saveReturnId(@Param("product") Product product);

    @Insert("insert into products (name, company_id) values (#{product.name, jdbcType=VARCHAR}, #{product.companyId, jdbcType=INTEGER})")
    void save(@Param("product") Product product);

    @Update("update products set name = #{product.name, jdbcType=VARCHAR} where id = #{product.id, jdbcType=INTEGER}")
    void update(@Param("product") Product product);

    @Delete("delete from products where id = #{id, jdbcType=INTEGER}")
    void delete(@Param("id") Integer id);


    @Select("select id, name, created_at as createdAt, company_id as companyId from products where id = #{id, jdbcType=INTEGER}")
    Product findById(@Param("id") Integer id);

    //    @Select("select id, name, created_at as createdAt, company_id from products where 1=1 ")
    @Select({"<script>",
            "select id, name, created_at as createdAt, company_id from products",
            "where 1 = 1 ",
            "<if test=\"filter!=null\"> and name = #{filter.name, jdbcType=VARCHAR} </if>",
            "</script>"})
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "companyId", column = "company_id"),
            @Result(property = "createdAt", column = "created_at")
    })
    List<Product> findByFilter(@Param("filter") Filter filter);
}
