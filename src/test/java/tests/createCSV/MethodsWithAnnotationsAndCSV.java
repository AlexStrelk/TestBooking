package tests.createCSV;


import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import org.junit.jupiter.api.Test;
import tests.check_in_check_oot_tests.CheckInCheckOut;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MethodsWithAnnotationsAndCSV {
    public static void main(String[] args) {
       int counter = 0;
        final Class<?> cls = CheckInCheckOut.class;
        Method[] methods = cls.getMethods();
        List<String[]> csvData = new ArrayList<>();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {
                csvData.add(new String[]{m.getName()});
            counter++;
            }
        }
        System.out.println("Methods with annotations 'TEST' - "+counter);
        try (CSVWriter writer = (CSVWriter) new CSVWriterBuilder(
                new FileWriter("methods.csv"))
                .withSeparator(',')
                .build()) {
            writer.writeAll(csvData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




