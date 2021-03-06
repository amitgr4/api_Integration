package com.binance.api.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.binance.api.Model.Trade;
@Repository
@EnableJpaRepositories
public interface TradeRepository extends CrudRepository<Trade,Long > {

}
