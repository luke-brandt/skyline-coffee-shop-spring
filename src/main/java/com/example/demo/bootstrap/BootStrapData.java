package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;



    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        long partCount = partRepository.count();
        long productCount = productRepository.count();

//        System.out.println("Started in Bootstrap");
//        System.out.println("Initial Number of Products"+partCount);
//        System.out.println(productRepository.findAll());
//        System.out.println("Initial Number of Parts"+productCount);
//        System.out.println(partRepository.findAll());


        if(partCount == 0) {

//            OutsourcedPart o= new OutsourcedPart();
//            o.setCompanyName("Western Governors University");
//            o.setName("out test");
//            o.setInv(5);
//            o.setPrice(20.0);
//            o.setId(100L);
//            outsourcedPartRepository.save(o);

            OutsourcedPart oPart1 = new OutsourcedPart();
            oPart1.setCompanyName("South American Coffee Roasters");
            oPart1.setName("Imported Light Roast");
            oPart1.setInv(40);
            oPart1.setPrice(10.0);
            oPart1.setMaxInv(100);
            oPart1.setMinInv(20);
            oPart1.setId(200L);
            outsourcedPartRepository.save(oPart1);

            OutsourcedPart oPart2 = new OutsourcedPart();
            oPart2.setCompanyName("South American Coffee Roasters");
            oPart2.setName("Imported Dark Roast");
            oPart2.setInv(35);
            oPart2.setPrice(8.0);
            oPart2.setMaxInv(100);
            oPart2.setMinInv(20);
            oPart2.setId(201L);
            outsourcedPartRepository.save(oPart2);

            InhousePart iPart1 = new InhousePart();
            iPart1.setName("Skyline Light Roast");
            iPart1.setInv(25);
            iPart1.setPrice(5.0);
            iPart1.setMaxInv(200);
            iPart1.setMinInv(20);
            iPart1.setId(101L);
            partRepository.save(iPart1);

            InhousePart iPart2 = new InhousePart();
            iPart2.setName("Skyline Medium Roast");
            iPart2.setInv(30);
            iPart2.setPrice(6.5);
            iPart2.setMaxInv(200);
            iPart2.setMinInv(20);
            iPart2.setId(102L);
            partRepository.save(iPart2);

            InhousePart iPart3 = new InhousePart();
            iPart3.setName("Skyline Dark Roast");
            iPart3.setInv(25);
            iPart3.setPrice(7.0);
            iPart3.setMaxInv(150);
            iPart3.setMinInv(20);
            iPart3.setId(103L);
            partRepository.save(iPart3);

            OutsourcedPart thePart = null;
            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("out test")) thePart = part;
            }

//            System.out.println(thePart.getCompanyName());

            //  List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }
        }

        if(productCount == 0) {
//            Product bicycle= new Product("bicycle",100.0,15);
//            Product unicycle= new Product("unicycle",100.0,15);
//            productRepository.save(bicycle);
//            productRepository.save(unicycle);
            Product latte= new Product("Latte",12.0,5);
            Product cappuccino= new Product("cappuccino",11.0,5);
            Product mocha= new Product("Mocha",10.0,5);
            Product espresso= new Product("Espresso",9.0,5);
            Product coldBrew= new Product("Cold Brew",5.0,5);
            productRepository.save(latte);
            productRepository.save(cappuccino);
            productRepository.save(mocha);
            productRepository.save(espresso);
            productRepository.save(coldBrew);


        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
