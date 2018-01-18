package com.viglet.shiohara.persistence.repository.post.type;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.viglet.shiohara.persistence.model.post.type.ShPostType;
import com.viglet.shiohara.persistence.model.post.type.ShPostTypeAttr;

public interface ShPostTypeAttrRepository extends JpaRepository<ShPostTypeAttr, Integer> {

	List<ShPostTypeAttr> findAll();

	ShPostTypeAttr findById(int id);
	
	ShPostTypeAttr findByShPostTypeAndName(ShPostType shPostType, String name);

	ShPostTypeAttr save(ShPostTypeAttr shPostTypeAttr);
	
	@Modifying
	@Query("delete from ShPostTypeAttr pta where pta.id = ?1")
	void delete(int shPostTypeAttrId);
}