package com.eniecole.enishop.dao

import com.eniecole.enishop.bo.Article

interface ArticleDAO {
    fun selectById(id: Long): Article
    fun addNewOne(article: Article): Long
}