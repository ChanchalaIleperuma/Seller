package Seller.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }

    public Seller getSellerBySellerEmail(String seller_email) {
        return sellerRepository.findSellerBySellerEmail(seller_email);
    }

    public Seller createSeller(Seller seller) {return sellerRepository.save(seller);}

    public Seller updateSeller(int id, Seller sellerDetails){
        Seller seller = sellerRepository.findSellerById(id);
        seller.setSellerEmail(sellerDetails.getSellerEmail());
       // seller.setSellerLastname(sellerDetails.getSellerLastname());

        return sellerRepository.save(seller);
    }

    // public void deleteSeller(int buyer_id){buyerRepository.deleteBuyerById(buyer_id);}
}

