package com.market.marketspring.domain.service;

import com.market.marketspring.domain.Purchase;
import com.market.marketspring.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;
    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }
    public Optional<List<Purchase>> getByClient(int clientId){
        return purchaseRepository.getByClient(clientId);

    }
    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }
}
