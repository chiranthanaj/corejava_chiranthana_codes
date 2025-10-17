package com.placement.placement_management.service;

import com.placement.placement_management.entity.Placement;
import com.placement.placement_management.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementServiceImpl implements PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    @Override
    public Placement createPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    @Override
    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    @Override
    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Placement not found with id " + id));
    }

    @Override
    public Placement updatePlacement(Long id, Placement placement) {
        Placement existing = getPlacementById(id);
        existing.setName(placement.getName());
        existing.setDate(placement.getDate());
        existing.setQualification(placement.getQualification());
        existing.setYear(placement.getYear());
        return placementRepository.save(existing);
    }


    @Override
    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}
