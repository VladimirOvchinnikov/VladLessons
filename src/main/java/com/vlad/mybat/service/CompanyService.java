package com.vlad.mybat.service;

import com.vlad.mybat.mapper.CompanyMapper;
import com.vlad.mybat.model.Company;
import com.vlad.mybat.util.Filter;
import com.vlad.mybat.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CompanyService {

    private CompanyMapper mapper;

    private SqlSession getSession() {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        mapper = session.getMapper(CompanyMapper.class);
        return session;
    }

    public void saveReturnId(Company company) {
        try {
            SqlSession session = getSession();
            try (session) {
                mapper.saveReturnId(company);
                session.commit();
            } catch (Exception e) {
                session.rollback();
                throw new RuntimeException("saveReturnId ", e);
            }
        } catch (Exception e) {
            throw e;
        }
    }


    public void save(Company company) {
        try {
            SqlSession session = getSession();
            try (session) {
                mapper.save(company);
                session.commit();
            } catch (Exception e) {
                session.rollback();
                throw new RuntimeException("save ", e);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void update(Company company) {
        try {
            SqlSession session = getSession();
            try (session) {
                mapper.update(company);
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

    public Company findById(Integer id) {
        try (SqlSession ignore = getSession()) {
            return mapper.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("findById ", e);
        }
    }

    public List<Company> findByName(String name) {
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
