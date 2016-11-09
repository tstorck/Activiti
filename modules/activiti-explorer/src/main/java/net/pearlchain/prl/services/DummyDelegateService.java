package net.pearlchain.prl.services;

import java.util.Map;
import java.util.Map.Entry;

import org.activiti.engine.delegate.DelegateExecution;

public class DummyDelegateService {

    public void execute(DelegateExecution execution, String graphItemDescriptorUUID){
        System.out.println("DummyDelegateService for " + graphItemDescriptorUUID);
        
        print("variables", execution.getVariables());
        print("vars local", execution.getVariablesLocal());
    }

    private void print(String string, Map<String, Object> variables) {
        System.out.println("_______" + string + "_______");
        for (Entry<String, Object> var : variables.entrySet()) {
            System.out.println("_" + var.getKey() + " : " + var.getValue());
        }
    }
    
}
