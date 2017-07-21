package org.stark.domain;

import org.omg.CORBA.Object;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shaoxiong on 2017/7/19.
 */
public interface UserRepository extends JpaRepository<Object, Integer> {

}
