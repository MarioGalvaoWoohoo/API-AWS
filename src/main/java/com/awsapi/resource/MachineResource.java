package com.awsapi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awsapi.entity.DetailedMachine;
import com.awsapi.entity.Machine;
import com.awsapi.service.MachineService;

@RestController
@RequestMapping(value = "machines")
public class MachineResource {
	
	@Autowired
	private MachineService machineService;
	
	@GetMapping(value = "/basic")
	public ResponseEntity<Machine> getMachineInformation() {
		Machine machine = machineService.getMachineInformation();
		return ResponseEntity.ok(machine);
	}
	
	@GetMapping(value = "/detailed")
	public ResponseEntity<DetailedMachine> getDetailedMachineInformation() {
		DetailedMachine detailedMachine = machineService.getMachineDetailedInformation();
		return ResponseEntity.ok(detailedMachine);
	}
}
