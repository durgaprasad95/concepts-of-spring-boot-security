package com.concepts.springBootSecurity.service.currentuser;

import com.concepts.springBootSecurity.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
