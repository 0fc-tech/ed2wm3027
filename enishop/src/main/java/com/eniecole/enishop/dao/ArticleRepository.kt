package com.eniecole.enishop.dao

import com.eniecole.enishop.bo.Article

object ArticleRepository {
    private val articleDaoMem = DaoFactory.createArticleDao(DaoType.MEMORY)
    private val articleDaoNet = DaoFactory.createArticleDao(DaoType.NETWORK)

    fun getArticle(id: Long): Article {
        return articleDaoMem.selectById(id)
    }
    fun addArticle(article: Article) : Long{
        return articleDaoMem.addNewOne(article)
    }
}