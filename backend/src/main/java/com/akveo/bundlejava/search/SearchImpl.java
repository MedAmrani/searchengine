package com.akveo.bundlejava.search;

import com.akveo.bundlejava.index.File;
import com.akveo.bundlejava.index.Resume;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
@Service
public class SearchImpl implements ISearch{
    @Autowired
    FileSearch respository;


    @Override
    public List<Resume> findAll() {
        return (List<Resume>) respository.getAll();
    }

    @Override
    public List<Resume> findByAuthor(String author) {
        return respository.findByAuthor(author);
    }

    @Override
    public List<Resume> findByTitle(String title) {
        return respository.findByTitle(title);
    }

    @Override
    public List<Resume> findByContent(String content) {
        return respository.findByContent(content);
    }
//
    @Override
    public Page<Resume> findByDateRange(String start, String end) {

        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .must(QueryBuilders.rangeQuery("meta.date")
                        .gte(start)
                        .lte(end));
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(queryBuilder);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();

        return respository.search(query);

    }

    public List<Resume> findByExtension(@RequestParam String extension) {

        return respository.findByExtension(extension);

    }
}
