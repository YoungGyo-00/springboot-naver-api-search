package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbRespositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository // Bean 객체로 생성해주는 어노테이션, DB나 file같은 외부 I/O 작업 처리
public class WishListRepository extends MemoryDbRespositoryAbstract<WishListEntity> {
}
