package com.awsapi.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

import com.awsapi.entity.DetailedMachine;
import com.awsapi.entity.Machine;

@Service
public class MachineService {

	public Machine getMachineInformation() {
		
		try {
			InetAddress addres = InetAddress.getLocalHost();
			String ip = addres.getHostAddress();
			String name = addres.getHostName();
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String osVersion = System.getProperty("os.version");
			
			Machine machine = new Machine(ip, name, os, arch, osVersion); 
			
			return machine;
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public DetailedMachine getMachineDetailedInformation() {
		
		try {
			InetAddress addres = InetAddress.getLocalHost();
			String ip = addres.getHostAddress();
			String name = addres.getHostName();
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String osVersion = System.getProperty("os.version");
			
			String javaVersion = System.getProperty("java.version");
			String javaVendor = System.getProperty("java.vendor");
			String javaVendorUrl = System.getProperty("java.vendor.url");
			
			DetailedMachine detailedMachine = new DetailedMachine(ip, name, os, arch, osVersion, javaVersion, javaVendor, javaVendorUrl); 
			
			return detailedMachine;
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return null;
		}
		
	}
		
}
