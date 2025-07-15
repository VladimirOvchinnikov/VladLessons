package com.vlad.mybat;

import com.vlad.mybat.model.Company;
import com.vlad.mybat.model.Product;
import com.vlad.mybat.service.CompanyService;
import com.vlad.mybat.service.ProductService;

import java.util.List;

public class MyBatisMain {

    public static void main(String[] args) {

        CompanyService companyService = new CompanyService();
        ProductService productService = new ProductService();

        for (int i = 0; i < 3; i++) {
            Company company = new Company();
            company.setName("c_" + i);
            companyService.save(company);
        }


        Company company1 = new Company();
        company1.setName("cc_1");
        companyService.saveReturnId(company1);

        company1.setName("for_delete");
        companyService.update(company1);//1

        Company findCompany = companyService.findById(company1.getId());
        System.out.println(findCompany);//найдено

        companyService.delete(company1.getId());//удалено
        Company deleteCompany = companyService.findById(company1.getId());//null
        System.out.println(deleteCompany);
        companyService.delete(company1.getId());//ничего

        List<Company> companies = companyService.findByName(null);
        System.out.println(companies.size());

        companies = companyService.findByName("c_0");
        System.out.println(companies.size());



        Integer companyId = companies.get(0).getId();
        for (int i = 0; i < 3; i++) {
            Product product = new Product();
            product.setName("p_" + i);
            product.setCompanyId(companyId);
            productService.save(product);
        }

        Product product1 = new Product();
        product1.setName("pp_1");
        product1.setCompanyId(companyId);
        productService.saveReturnId(product1);

        product1.setName("for_delete");
        productService.update(product1);//1

        Product findProduct = productService.findById(product1.getId());
        System.out.println(findProduct);//найдено

        productService.delete(product1.getId());//удалено
        Product deleteProduct = productService.findById(product1.getId());//null
        System.out.println(deleteProduct);
        productService.delete(product1.getId());//ничего

        List<Product> products = productService.findByName(null);
        System.out.println(products.size());

        products = productService.findByName("p_0");
        System.out.println(products.size());

        System.out.println("Hello mybatis");
    }
}
