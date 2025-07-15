package com.vlad.mybat.mapper;

import com.vlad.mybat.model.Company;
import com.vlad.mybat.util.Filter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyMapper {

    void saveReturnId(@Param("company") Company company);

    void save(@Param("company") Company company);
    void update(@Param("company") Company company);
    void delete(@Param("id") Integer id);
    Company findById(@Param("id") Integer id);
    List<Company> findByFilter(@Param("filter") Filter filter);
}
