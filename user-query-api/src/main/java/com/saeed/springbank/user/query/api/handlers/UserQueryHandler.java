package com.saeed.springbank.user.query.api.handlers;

import com.saeed.springbank.user.query.api.dto.UserLookupResponse;
import com.saeed.springbank.user.query.api.queries.FindAllUsersQuery;
import com.saeed.springbank.user.query.api.queries.FindUserByIdQuery;

public interface UserQueryHandler {
    UserLookupResponse getUserById(FindUserByIdQuery query);

    UserLookupResponse getAllUsers(FindAllUsersQuery query);
}
