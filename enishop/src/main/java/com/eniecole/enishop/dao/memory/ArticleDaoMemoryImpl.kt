package com.eniecole.enishop.dao.memory

import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleDAO
import java.time.LocalDate

class ArticleDaoMemoryImpl : ArticleDAO {
    val articlesInMemory = mutableListOf<Article>(
        Article(1L,"MacbookPro",4000.0,"Ordinateur très cher","https://", LocalDate.now()),
        Article(2L,"HPEnvy",2000.0,"Ordinateur un peu moins cher mais moins qualit","https://", LocalDate.now()),
        Article(3L,"Dell XPS",2500.0,"Ordinateur quali et pas trop cher","https://", LocalDate.now())
    )
    override fun selectById(id: Long): Article {
        return articlesInMemory.first { it.id == id }
    }

    override fun addNewOne(article: Article): Long {
        val numberOfArticles = articlesInMemory.size
        //L'article en entrée aura toujours son ID mis à jour avec une incrémentation
        articlesInMemory.add(article.copy(id=numberOfArticles+1L))
        return numberOfArticles+1L
    }

    override fun selectAll(): List<Article> = articlesInMemory

}