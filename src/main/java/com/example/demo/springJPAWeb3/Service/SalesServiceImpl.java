package com.example.demo.springJPAWeb3.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.springJPAWeb3.data.entity.Sales;
import com.example.demo.springJPAWeb3.repository.SalesRepository;



@Service
public class SalesServiceImpl implements SalesService {
	private final SalesRepository salesRepository;
	

	public SalesServiceImpl(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	@Override
	public Sales getSale(int id) {
		Optional<Sales> sale = salesRepository.findById((int) id);
		return sale.orElse(null);
	}
}