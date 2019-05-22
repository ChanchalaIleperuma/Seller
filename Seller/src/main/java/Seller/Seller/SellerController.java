package Seller.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SellerController {
    @Autowired
    private SellerService sellerService;

    @GetMapping(value = "/Seller/Seller", params = "seller_email")
    public ResponseEntity<Seller> getBuyerByBuyerEmail(@RequestParam(name = "seller_email") String sellerEmail) {
        return new ResponseEntity<Seller>(sellerService.getSellerBySellerEmail(sellerEmail), HttpStatus.OK);
    }

    @GetMapping("/Seller/Seller")
    public ResponseEntity<List<Seller>> getAllSellers(){
        return new ResponseEntity<>(sellerService.getAllSellers(), HttpStatus.OK);
    }

    @PostMapping("/Seller/Seller")
    public ResponseEntity<Seller> createSeller(@RequestBody Seller seller){
        return new ResponseEntity<>(sellerService.createSeller(seller),HttpStatus.OK);
    }

    @PutMapping("/Seller/Seller/{seller_id}")
    public ResponseEntity<Seller> updateSeller(@PathVariable int seller_id, @RequestBody Seller seller){
        return new ResponseEntity<Seller>(sellerService.updateSeller(seller_id, seller), HttpStatus.OK);
    }

   /* @DeleteMapping("/Seller/{seller_id}")
        public ResponseEntity deleteSeller(@PathVariable int seller_id) {
            sellerService.deleteSeller(seller_id);
            return new ResponseEntity(HttpStatus.OK);

        }*/

}
