package com.vlad.mybat.service;

import com.vlad.mybat.mapper.ProductMapper;
import com.vlad.mybat.model.Product;
import com.vlad.mybat.util.Filter;
import com.vlad.mybat.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ProductService {

    private ProductMapper mapper;

    private SqlSession getSession() {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        mapper = session.getMapper(ProductMapper.class);
        return session;
    }

    public void saveReturnId(Product product) {
        try {
            SqlSession session = getSession();
            try (session) {
                mapper.saveReturnId(product);
                session.commit();
            } catch (Exception e) {
                session.rollback();

                throw new RuntimeException("saveReturnId ", e);
            }
        } catch (Exception e) {
            throw e;
        }
    }


    public void save(Product product) {
        try {
            SqlSession session = getSession();
            try (session) {
                mapper.save(product);
                session.commit();
            } catch (Exception e) {
                session.rollback();
                throw new RuntimeException("save ", e);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void update(Product product) {
        try {
            SqlSession session = getSession();
            try (session) {
                mapper.update(product);
                session.commit();
            } catch (Exception e) {
                session.rollback();
                throw new RuntimeException("update ", e);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void delete(Integer id) {
        try {
            SqlSession session = getSession();
            try (session) {
                mapper.delete(id);
                session.commit();
            } catch (Exception e) {
                session.rollback();
                throw new RuntimeException("delete ", e);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Product findById(Integer id) {
        try (SqlSession ignore = getSession()) {
            return mapper.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("findById ", e);
        }
    }

    public List<Product> findByName(String name) {
        Filter filter = null;
        if (name != null) {
            filter = new Filter();
            filter.setName(name);
        }
        try (SqlSession ignore = getSession()) {
            return mapper.findByFilter(filter);
        } catch (Exception e) {
            throw new RuntimeException("findByName ", e);
        }
    }
}
