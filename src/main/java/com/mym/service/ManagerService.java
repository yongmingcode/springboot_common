package com.mym.service;

import com.mym.domain.Manager;
import org.springframework.stereotype.Service;

/**
 * @author Aming
 * @date 2019/5/16 22:59
 * @desc
 */
public interface ManagerService {
    Manager findManagerByName(String name);
}
