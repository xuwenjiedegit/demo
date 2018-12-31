package com.song.repository;

import com.song.entity.User;
import com.song.entity.xinnaoxueguan;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;


@Repository
public interface  UserRepositoty extends JpaRepository<xinnaoxueguan,xinnaoxueguan> {

 //   @Query("select t from User t where t.name = :name")
  //  User findByUserName(@Param("name") String name);
  //  @Query("")
    //@SQLInsert()
    //xinnaoxueguan insert(@ModelAttribute(xinnaoxueguan) xinnaoxueguan x);
    //CrudRepository sw=new CrudRepository;

    @Override
    <S extends xinnaoxueguan> S save(S entity);
}
