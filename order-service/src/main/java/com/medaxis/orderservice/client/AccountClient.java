package com.medaxis.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author 虎哥
 */
@FeignClient("account-service")
public interface AccountClient {

    @PutMapping("/account/{userId}/{money}")
    void deduct(@PathVariable("userId") String userId, @PathVariable("money") Integer money);
}
