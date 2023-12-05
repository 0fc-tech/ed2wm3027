package com.eniecole.enishop.dao

import com.eniecole.enishop.dao.memory.ArticleDaoMemoryImpl
import com.eniecole.enishop.dao.network.ArticleDaoNetworkImpl

object DaoFactory {
    fun createArticleDao(type:DaoType): ArticleDAO = when(type){
        DaoType.MEMORY -> ArticleDaoMemoryImpl()
        DaoType.NETWORK -> ArticleDaoNetworkImpl()
    }
}