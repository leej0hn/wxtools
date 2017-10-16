package com.redscarf.wxtools.persistence.mongo.dao;

import com.redscarf.wxtools.common.model.mongo.TestMongoModel;
import com.redscarf.wxtools.persistence.mongo.repository.CustomerRepository;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2016/8/4
 * <p>Version: 1.0
 */
public interface TestMongoModelDao extends CustomerRepository<TestMongoModel, String> {

}
