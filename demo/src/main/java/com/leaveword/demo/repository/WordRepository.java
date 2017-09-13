package com.leaveword.demo.repository;

import com.leaveword.demo.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface  WordRepository extends JpaRepository<Word,Integer>{

}
