package com.brick.spring;

import com.brick.spring.dao.ArticleDao;
import com.brick.spring.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class MongoDbTest {
    @Autowired
    private ArticleDao articleDao;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mongodb.xml");
        MongoDbTest consumer = (MongoDbTest) ctx.getBean("mongoDbTest");
        Article article = new Article();
        article.setId(1);
        article.setName("dalianpai");
        article.setContent("dalianpai123");
        article.setHits(100);

        consumer.articleDao.save(article);

    }
}
