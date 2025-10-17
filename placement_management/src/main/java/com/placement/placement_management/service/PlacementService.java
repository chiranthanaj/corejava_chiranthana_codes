package com.placement.placement_management.service;

import com.placement.placement_management.entity.Placement;
import java.util.List;

public interface PlacementService {
    Placement createPlacement(Placement placement);
    List<Placement> getAllPlacements();
    Placement getPlacementById(Long id);
    Placement updatePlacement(Long id, Placement placement);
    void deletePlacement(Long id);
}
