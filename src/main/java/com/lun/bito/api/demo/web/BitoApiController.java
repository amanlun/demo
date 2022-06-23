package com.lun.bito.api.demo.web;

import com.lun.bito.api.demo.entity.Member;
import com.lun.bito.api.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BitoApiController {



    @Autowired
    MemberRepository memberRepository;

    @PostMapping(value ="/greeting")
    public String greeting(@RequestBody Member member) {
        memberRepository.save(member);


        return new String("do some thing");
    }

    @PostMapping(value ="/saveAll")
    public String greeting(@RequestBody List<Member> members) {
//        memberRepository.saveAll(members);
        memberRepository.saveAllAndFlush(members);


        return new String("do some thing2");
    }


}
