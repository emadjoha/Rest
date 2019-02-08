package com.rest.Rest.repo;


import com.querydsl.core.types.dsl.StringPath;
import com.rest.Rest.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface TaskRepo extends JpaRepository<Task, UUID>
   {
//    @Override
//    default public void customize(QuerydslBindings bindings, QTask task) {
//
//        bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
//    }


}
