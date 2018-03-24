package org.kang.springstudymvn001.users;

import org.springframework.stereotype.Service;

@Service
public class UserAnnotationService {
    public String userName() {
        return "userName";
    }
}
