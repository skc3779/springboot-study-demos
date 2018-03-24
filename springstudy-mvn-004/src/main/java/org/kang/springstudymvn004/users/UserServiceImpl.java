package org.kang.springstudymvn004.users;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /**
     * Autowired 를 프로퍼티에 직접 하는 방법과
     * 싱글 생성객체 UserServiceImpl 에 사용하는 방법 2가지 가 있음
     */
    //  @Autowired
    UserRepository userRepository;

    /**
     * @Autowired 이 없어도 사용 가능하다.
     * @param userRepository
     */
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
