package com.SimbadMart.maven.simbadMart;

import com.SimbadMart.maven.simbadMart.product.Product;
import com.SimbadMart.maven.simbadMart.product.ProductRepository;
import com.SimbadMart.maven.simbadMart.storage.Storage;
import com.SimbadMart.maven.simbadMart.storage.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Seed implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    StorageRepository storageRepository;
    List<Product> products = new ArrayList<>();
    List<Storage> storages = new ArrayList<>();
    Random storageAmountRandomizer = new Random();

    @Override
    public void run(String... args) throws Exception {
        seedProduct();
        seedStorage();
    }


    public void seedStorage() {
        if (storageRepository.count() == 0) {
            for (Product product : products) {
                storages.add(new Storage(storageAmountRandomizer.nextInt(120), product, null));
            }

            for (Storage storage : storages) {
                storageRepository.save(storage);
            }
            System.out.println("Stored: " + storageRepository.count() + " products");
        }
    }


    public void seedProduct() {
        if (productRepository.count() == 0) {
            // Fruits
            products.add(new Product("Apple", "Fruits", new BigDecimal("1.99"), "Fresh and delicious apples.", new BigDecimal("1.49")));
            products.add(new Product("Banana", "Fruits", new BigDecimal("0.79"), "Ripe and sweet bananas.", new BigDecimal("0.69")));
            products.add(new Product("Orange", "Fruits", new BigDecimal("0.99"), "Juicy and sweet oranges.", new BigDecimal("0.89")));
            products.add(new Product("Grapes", "Fruits", new BigDecimal("3.49"), "Sweet and juicy grapes.", new BigDecimal("2.99")));
            products.add(new Product("Mango", "Fruits", new BigDecimal("2.99"), "Ripe and succulent mango.", new BigDecimal("2.49")));
            products.add(new Product("Strawberry", "Fruits", new BigDecimal("2.49"), "Sweet and juicy strawberries.", new BigDecimal("1.99")));
            products.add(new Product("Pineapple", "Fruits", new BigDecimal("3.99"), "Fresh and tropical pineapple slices.", new BigDecimal("3.49")));
            products.add(new Product("Kiwi", "Fruits", new BigDecimal("0.89"), "Fresh and tangy kiwis.", new BigDecimal("0.79")));
            products.add(new Product("Watermelon", "Fruits", new BigDecimal("4.99"), "Sweet and refreshing watermelon.", new BigDecimal("3.99")));
            products.add(new Product("Cherry", "Fruits", new BigDecimal("2.79"), "Juicy and plump cherries.", new BigDecimal("2.29")));
            products.add(new Product("Pomegranate", "Fruits", new BigDecimal("3.79"), "Seeds of health and taste.", new BigDecimal("2.99")));
            products.add(new Product("Blueberries", "Fruits", new BigDecimal("3.29"), "Plump and flavorful blueberries.", new BigDecimal("2.99")));
            products.add(new Product("Pear", "Fruits", new BigDecimal("1.49"), "Sweet and juicy pears.", new BigDecimal("1.29")));
            products.add(new Product("Papaya", "Fruits", new BigDecimal("2.79"), "Tropical and luscious papaya.", new BigDecimal("2.49")));
            products.add(new Product("Plum", "Fruits", new BigDecimal("1.69"), "Sweet and succulent plums.", new BigDecimal("1.29")));
            products.add(new Product("Apricot", "Fruits", new BigDecimal("1.99"), "Golden and flavorful apricots.", new BigDecimal("1.49")));
            products.add(new Product("Blackberry", "Fruits", new BigDecimal("2.49"), "Dark and delicious blackberries.", new BigDecimal("1.99")));
            products.add(new Product("Raspberry", "Fruits", new BigDecimal("2.99"), "Tangy and aromatic raspberries.", new BigDecimal("2.49")));
            products.add(new Product("Cranberry", "Fruits", new BigDecimal("2.29"), "Tart and nutritious cranberries.", new BigDecimal("1.79")));
            products.add(new Product("Fig", "Fruits", new BigDecimal("2.79"), "Sweet and nutritious figs.", new BigDecimal("2.29")));
            products.add(new Product("Guava", "Fruits", new BigDecimal("1.89"), "Tropical and flavorful guava.", new BigDecimal("1.49")));
            products.add(new Product("Passion Fruit", "Fruits", new BigDecimal("2.99"), "Exotic and tangy passion fruit.", new BigDecimal("2.49")));
            products.add(new Product("Lemon", "Fruits", new BigDecimal("0.69"), "Tart and zesty lemons.", new BigDecimal("0.59")));
            products.add(new Product("Lime", "Fruits", new BigDecimal("0.79"), "Citrusy and refreshing limes.", new BigDecimal("0.69")));
            products.add(new Product("Coconut", "Fruits", new BigDecimal("2.99"), "Tropical and creamy coconut.", new BigDecimal("2.49")));
            products.add(new Product("Kiwi Gold", "Fruits", new BigDecimal("1.49"), "Golden kiwi with a sweet flavor.", new BigDecimal("1.29")));
            products.add(new Product("Mandarin", "Fruits", new BigDecimal("1.19"), "Easy-peel and juicy mandarins.", new BigDecimal("0.99")));
            products.add(new Product("Cantaloupe", "Fruits", new BigDecimal("3.49"), "Sweet and aromatic cantaloupe.", new BigDecimal("2.99")));
            products.add(new Product("Jackfruit", "Fruits", new BigDecimal("4.99"), "Exotic and versatile jackfruit.", new BigDecimal("3.99")));
            products.add(new Product("Dragon Fruit", "Fruits", new BigDecimal("3.79"), "Vibrant and refreshing dragon fruit.", new BigDecimal("3.29")));
            products.add(new Product("Blackcurrant", "Fruits", new BigDecimal("2.29"), "Rich and intense blackcurrants.", new BigDecimal("1.99")));

            // Dairy
            products.add(new Product("Milk", "Dairy", new BigDecimal("2.49"), "Fresh whole milk.", new BigDecimal("2.19")));
            products.add(new Product("Yogurt", "Dairy", new BigDecimal("1.79"), "Creamy yogurt.", new BigDecimal("1.59")));
            products.add(new Product("Eggs", "Dairy", new BigDecimal("2.29"), "Farm-fresh eggs.", new BigDecimal("1.99")));
            products.add(new Product("Cheese", "Dairy", new BigDecimal("3.49"), "Aged cheddar cheese.", new BigDecimal("2.99")));
            products.add(new Product("Butter", "Dairy", new BigDecimal("2.99"), "Creamy butter.", new BigDecimal("2.49")));
            products.add(new Product("Cottage Cheese", "Dairy", new BigDecimal("2.19"), "Light and creamy cottage cheese.", new BigDecimal("1.99")));
            products.add(new Product("Heavy Cream", "Dairy", new BigDecimal("3.29"), "Rich and luxurious heavy cream.", new BigDecimal("2.79")));
            products.add(new Product("Sour Cream", "Dairy", new BigDecimal("1.99"), "Tangy and smooth sour cream.", new BigDecimal("1.79")));
            products.add(new Product("Almond Milk", "Dairy", new BigDecimal("2.99"), "Nutty and creamy almond milk.", new BigDecimal("2.49")));
            products.add(new Product("Coconut Milk", "Dairy", new BigDecimal("2.49"), "Creamy and tropical coconut milk.", new BigDecimal("1.99")));
            products.add(new Product("Soy Milk", "Dairy", new BigDecimal("2.29"), "Plant-based and nutritious soy milk.", new BigDecimal("1.99")));
            products.add(new Product("Cashew Milk", "Dairy", new BigDecimal("3.49"), "Smooth and creamy cashew milk.", new BigDecimal("2.99")));
            products.add(new Product("Oat Milk", "Dairy", new BigDecimal("2.79"), "Creamy and dairy-free oat milk.", new BigDecimal("2.29")));
            products.add(new Product("Hemp Milk", "Dairy", new BigDecimal("3.99"), "Nutritious and plant-based hemp milk.", new BigDecimal("3.29")));
            products.add(new Product("Rice Milk", "Dairy", new BigDecimal("2.59"), "Light and refreshing rice milk.", new BigDecimal("2.19")));
            products.add(new Product("Condensed Milk", "Dairy", new BigDecimal("2.99"), "Sweet and creamy condensed milk.", new BigDecimal("2.49")));
            products.add(new Product("Evaporated Milk", "Dairy", new BigDecimal("1.99"), "Rich and concentrated evaporated milk.", new BigDecimal("1.79")));
            products.add(new Product("Goat Milk", "Dairy", new BigDecimal("3.99"), "Wholesome and goat's milk.", new BigDecimal("3.29")));
            products.add(new Product("Mozzarella Cheese", "Dairy", new BigDecimal("2.99"), "Stretchy and flavorful mozzarella cheese.", new BigDecimal("2.49")));
            products.add(new Product("Gouda Cheese", "Dairy", new BigDecimal("3.49"), "Smooth and nutty gouda cheese.", new BigDecimal("2.99")));
            products.add(new Product("Brie Cheese", "Dairy", new BigDecimal("3.99"), "Creamy and indulgent brie cheese.", new BigDecimal("3.29")));
            products.add(new Product("Feta Cheese", "Dairy", new BigDecimal("2.79"), "Tangy and crumbly feta cheese.", new BigDecimal("2.29")));
            products.add(new Product("Swiss Cheese", "Dairy", new BigDecimal("3.29"), "Hole-y and nutty Swiss cheese.", new BigDecimal("2.79")));
            products.add(new Product("Blue Cheese", "Dairy", new BigDecimal("2.99"), "Bold and pungent blue cheese.", new BigDecimal("2.49")));
            products.add(new Product("Parmesan Cheese", "Dairy", new BigDecimal("3.79"), "Savory and grated parmesan cheese.", new BigDecimal("3.29")));
            products.add(new Product("Cream Cheese", "Dairy", new BigDecimal("1.79"), "Smooth and spreadable cream cheese.", new BigDecimal("1.59")));
            products.add(new Product("Ricotta Cheese", "Dairy", new BigDecimal("2.49"), "Light and creamy ricotta cheese.", new BigDecimal("1.99")));
            products.add(new Product("Camembert Cheese", "Dairy", new BigDecimal("3.99"), "Rich and velvety camembert cheese.", new BigDecimal("3.49")));
            products.add(new Product("Quark Cheese", "Dairy", new BigDecimal("2.99"), "Soft and tangy quark cheese.", new BigDecimal("2.49")));

            // Meat
            products.add(new Product("Chicken", "Meat", new BigDecimal("5.99"), "Boneless chicken breast.", new BigDecimal("5.49")));
            products.add(new Product("Beef", "Meat", new BigDecimal("7.99"), "Premium beef cuts.", new BigDecimal("7.29")));
            products.add(new Product("Pork", "Meat", new BigDecimal("6.99"), "Tender pork chops.", new BigDecimal("6.49")));
            products.add(new Product("Lamb", "Meat", new BigDecimal("8.99"), "Tender and succulent lamb chops.", new BigDecimal("8.49")));
            products.add(new Product("Turkey", "Meat", new BigDecimal("5.49"), "Lean and flavorful turkey.", new BigDecimal("4.99")));
            products.add(new Product("Duck", "Meat", new BigDecimal("9.99"), "Rich and tender duck meat.", new BigDecimal("9.49")));
            products.add(new Product("Salami", "Meat", new BigDecimal("3.49"), "Savory and cured salami.", new BigDecimal("2.99")));
            products.add(new Product("Bacon", "Meat", new BigDecimal("4.99"), "Crispy and smoky bacon.", new BigDecimal("4.49")));
            products.add(new Product("Sausage", "Meat", new BigDecimal("3.99"), "Juicy and flavorful sausage.", new BigDecimal("3.49")));
            products.add(new Product("Ham", "Meat", new BigDecimal("4.49"), "Succulent and glazed ham.", new BigDecimal("3.99")));
            products.add(new Product("Pepperoni", "Meat", new BigDecimal("2.99"), "Spicy and thinly sliced pepperoni.", new BigDecimal("2.49")));
            products.add(new Product("Ground Beef", "Meat", new BigDecimal("6.49"), "Versatile and lean ground beef.", new BigDecimal("5.99")));
            products.add(new Product("Ground Turkey", "Meat", new BigDecimal("5.29"), "Lean and ground turkey.", new BigDecimal("4.99")));
            products.add(new Product("Chicken Thighs", "Meat", new BigDecimal("4.99"), "Moist and flavorful chicken thighs.", new BigDecimal("4.49")));
            products.add(new Product("Chicken Wings", "Meat", new BigDecimal("3.99"), "Finger-licking chicken wings.", new BigDecimal("3.49")));
            products.add(new Product("Ribeye Steak", "Meat", new BigDecimal("9.99"), "Juicy and marbled ribeye steak.", new BigDecimal("8.99")));
            products.add(new Product("Sirloin Steak", "Meat", new BigDecimal("8.99"), "Tender and flavorful sirloin steak.", new BigDecimal("7.99")));
            products.add(new Product("Filet Mignon", "Meat", new BigDecimal("11.99"), "Elegant and tender filet mignon.", new BigDecimal("10.99")));
            products.add(new Product("Lamb Chops", "Meat", new BigDecimal("10.99"), "Delicious and succulent lamb chops.", new BigDecimal("9.99")));
            products.add(new Product("Pork Ribs", "Meat", new BigDecimal("7.49"), "Tender and finger-licking pork ribs.", new BigDecimal("6.99")));
            products.add(new Product("Beef Brisket", "Meat", new BigDecimal("9.49"), "Smoked and flavorful beef brisket.", new BigDecimal("8.99")));
            products.add(new Product("Ground Pork", "Meat", new BigDecimal("4.49"), "Versatile and ground pork.", new BigDecimal("3.99")));
            products.add(new Product("Ground Lamb", "Meat", new BigDecimal("8.49"), "Flavorful and ground lamb.", new BigDecimal("7.99")));
            products.add(new Product("Ground Chicken", "Meat", new BigDecimal("4.99"), "Lean and ground chicken.", new BigDecimal("4.49")));
            products.add(new Product("Bison Steak", "Meat", new BigDecimal("12.99"), "Lean and nutritious bison steak.", new BigDecimal("11.99")));
            products.add(new Product("Venison", "Meat", new BigDecimal("10.99"), "Lean and gamey venison meat.", new BigDecimal("9.99")));
            products.add(new Product("Elk Meat", "Meat", new BigDecimal("11.49"), "Tender and flavorful elk meat.", new BigDecimal("10.99")));
            products.add(new Product("Kangaroo Steak", "Meat", new BigDecimal("13.99"), "Lean and exotic kangaroo steak.", new BigDecimal("12.99")));

            // Bakery
            products.add(new Product("Bread", "Bakery", new BigDecimal("1.99"), "Soft and delicious bread.", new BigDecimal("1.79")));
            products.add(new Product("Croissant", "Bakery", new BigDecimal("1.79"), "Buttery and flaky croissant.", new BigDecimal("1.49")));
            products.add(new Product("Baguette", "Bakery", new BigDecimal("2.49"), "Classic French baguette.", new BigDecimal("1.99")));
            products.add(new Product("Pita Bread", "Bakery", new BigDecimal("1.29"), "Soft and versatile pita bread.", new BigDecimal("0.99")));
            products.add(new Product("Cinnamon Roll", "Bakery", new BigDecimal("2.99"), "Sweet and gooey cinnamon roll.", new BigDecimal("2.49")));
            products.add(new Product("Dinner Roll", "Bakery", new BigDecimal("1.49"), "Soft and fluffy dinner roll.", new BigDecimal("1.19")));
            products.add(new Product("Sourdough Bread", "Bakery", new BigDecimal("3.49"), "Artisanal and tangy sourdough.", new BigDecimal("2.99")));
            products.add(new Product("Whole Wheat Bread", "Bakery", new BigDecimal("2.29"), "Nutritious and hearty whole wheat bread.", new BigDecimal("1.99")));
            products.add(new Product("Bagel", "Bakery", new BigDecimal("1.99"), "Chewy and delicious bagel.", new BigDecimal("1.59")));
            products.add(new Product("Muffin", "Bakery", new BigDecimal("1.79"), "Moist and flavorful muffin.", new BigDecimal("1.49")));
            products.add(new Product("Focaccia", "Bakery", new BigDecimal("2.99"), "Italian flatbread with herbs and olive oil.", new BigDecimal("2.49")));
            products.add(new Product("Pretzel", "Bakery", new BigDecimal("1.49"), "Salty and chewy pretzel.", new BigDecimal("1.19")));
            products.add(new Product("Cupcake", "Bakery", new BigDecimal("1.99"), "Sweet and colorful cupcake.", new BigDecimal("1.59")));
            products.add(new Product("Brioche", "Bakery", new BigDecimal("2.49"), "Rich and buttery brioche.", new BigDecimal("1.99")));
            products.add(new Product("Naan Bread", "Bakery", new BigDecimal("1.79"), "Soft and fluffy Indian naan bread.", new BigDecimal("1.49")));
            products.add(new Product("Rye Bread", "Bakery", new BigDecimal("2.29"), "Dark and hearty rye bread.", new BigDecimal("1.99")));
            products.add(new Product("Cornbread", "Bakery", new BigDecimal("1.99"), "Moist and slightly sweet cornbread.", new BigDecimal("1.59")));
            products.add(new Product("Danish Pastry", "Bakery", new BigDecimal("2.99"), "Buttery and filled Danish pastry.", new BigDecimal("2.49")));
            products.add(new Product("Pumpernickel Bread", "Bakery", new BigDecimal("2.29"), "Dense and dark pumpernickel bread.", new BigDecimal("1.99")));
            products.add(new Product("Pretzel Bun", "Bakery", new BigDecimal("1.49"), "Soft and pretzel-flavored bun.", new BigDecimal("1.19")));
            products.add(new Product("Fruit Cake", "Bakery", new BigDecimal("3.49"), "Rich and festive fruit cake.", new BigDecimal("2.99")));
            products.add(new Product("Fougasse", "Bakery", new BigDecimal("2.79"), "French flatbread with olive oil and herbs.", new BigDecimal("2.29")));
            products.add(new Product("Anpan", "Bakery", new BigDecimal("1.99"), "Japanese sweet red bean bun.", new BigDecimal("1.49")));
            products.add(new Product("Ciabatta", "Bakery", new BigDecimal("2.99"), "Italian rustic bread with a crispy crust.", new BigDecimal("2.49")));
            products.add(new Product("Hamburger Bun", "Bakery", new BigDecimal("1.79"), "Soft and versatile hamburger bun.", new BigDecimal("1.49")));
            products.add(new Product("Cranberry Orange Bread", "Bakery", new BigDecimal("2.49"), "Tangy and sweet cranberry orange bread.", new BigDecimal("1.99")));
            products.add(new Product("Fruit Scone", "Bakery", new BigDecimal("1.79"), "Delicious and fruity scone.", new BigDecimal("1.49")));
            products.add(new Product("Pita Chip", "Bakery", new BigDecimal("1.99"), "Crunchy and seasoned pita chips.", new BigDecimal("1.49")));
            products.add(new Product("Hot Cross Bun", "Bakery", new BigDecimal("1.69"), "Spiced and raisin-filled hot cross bun.", new BigDecimal("1.29")));
            products.add(new Product("Garlic Bread", "Bakery", new BigDecimal("2.29"), "Buttery and garlicky garlic bread.", new BigDecimal("1.99")));
            products.add(new Product("Potato Bread", "Bakery", new BigDecimal("1.99"), "Soft and potato-infused bread.", new BigDecimal("1.49")));
            products.add(new Product("Stollen", "Bakery", new BigDecimal("3.99"), "German Christmas fruitcake.", new BigDecimal("3.49")));
            products.add(new Product("Zopf", "Bakery", new BigDecimal("2.79"), "Swiss braided bread with a soft texture.", new BigDecimal("2.29")));

            // Vegetables
            products.add(new Product("Cucumber", "Vegetables", new BigDecimal("1.29"), "Crisp and fresh cucumber.", new BigDecimal("0.99")));
            products.add(new Product("Carrot", "Vegetables", new BigDecimal("0.89"), "Fresh and crunchy carrots.", new BigDecimal("0.69")));
            products.add(new Product("Tomato", "Vegetables", new BigDecimal("1.19"), "Ripe and juicy tomatoes.", new BigDecimal("0.99")));
            products.add(new Product("Potato", "Vegetables", new BigDecimal("0.99"), "Fresh potatoes.", new BigDecimal("0.79")));
            products.add(new Product("Bell Pepper", "Vegetables", new BigDecimal("0.99"), "Colorful and crisp bell peppers.", new BigDecimal("0.79")));
            products.add(new Product("Spinach", "Vegetables", new BigDecimal("1.79"), "Fresh spinach leaves.", new BigDecimal("1.59")));
            products.add(new Product("Onion", "Vegetables", new BigDecimal("0.79"), "Fresh onions.", new BigDecimal("0.69")));
            products.add(new Product("Lettuce", "Vegetables", new BigDecimal("1.49"), "Fresh lettuce leaves.", new BigDecimal("1.19")));
            products.add(new Product("Broccoli", "Vegetables", new BigDecimal("1.99"), "Fresh broccoli.", new BigDecimal("1.79")));
            products.add(new Product("Cauliflower", "Vegetables", new BigDecimal("1.89"), "White and nutritious cauliflower.", new BigDecimal("1.49")));
            products.add(new Product("Zucchini", "Vegetables", new BigDecimal("1.29"), "Versatile and tender zucchini.", new BigDecimal("0.99")));
            products.add(new Product("Eggplant", "Vegetables", new BigDecimal("1.79"), "Purple and flavorful eggplant.", new BigDecimal("1.49")));
            products.add(new Product("Asparagus", "Vegetables", new BigDecimal("2.29"), "Tender and green asparagus.", new BigDecimal("1.99")));
            products.add(new Product("Kale", "Vegetables", new BigDecimal("1.99"), "Nutritious and hearty kale.", new BigDecimal("1.79")));
            products.add(new Product("Cabbage", "Vegetables", new BigDecimal("1.49"), "Crunchy and leafy cabbage.", new BigDecimal("1.19")));
            products.add(new Product("Mushroom", "Vegetables", new BigDecimal("2.49"), "Earthy and flavorful mushrooms.", new BigDecimal("1.99")));
            products.add(new Product("Sweet Potato", "Vegetables", new BigDecimal("1.69"), "Nutty and sweet sweet potatoes.", new BigDecimal("1.29")));
            products.add(new Product("Radish", "Vegetables", new BigDecimal("0.99"), "Crisp and spicy radishes.", new BigDecimal("0.79")));
            products.add(new Product("Artichoke", "Vegetables", new BigDecimal("2.99"), "Tender and unique artichokes.", new BigDecimal("2.49")));
            products.add(new Product("Beetroot", "Vegetables", new BigDecimal("1.49"), "Sweet and earthy beetroot.", new BigDecimal("1.19")));
            products.add(new Product("Celeriac", "Vegetables", new BigDecimal("1.79"), "Versatile and flavorful celeriac.", new BigDecimal("1.49")));
            products.add(new Product("Fennel", "Vegetables", new BigDecimal("1.99"), "Crunchy and aromatic fennel.", new BigDecimal("1.79")));
            products.add(new Product("Leek", "Vegetables", new BigDecimal("1.49"), "Mild and onion-like leeks.", new BigDecimal("1.19")));
            products.add(new Product("Pumpkin", "Vegetables", new BigDecimal("2.49"), "Sweet and vibrant pumpkin.", new BigDecimal("1.99")));
            products.add(new Product("Snow Peas", "Vegetables", new BigDecimal("2.99"), "Crunchy and sweet snow peas.", new BigDecimal("2.49")));
            products.add(new Product("Cherry Tomato", "Vegetables", new BigDecimal("1.69"), "Small and sweet cherry tomatoes.", new BigDecimal("1.29")));
            products.add(new Product("Spring Onion", "Vegetables", new BigDecimal("0.99"), "Fresh and mild spring onions.", new BigDecimal("0.79")));
            products.add(new Product("Butternut Squash", "Vegetables", new BigDecimal("2.79"), "Creamy and nutty butternut squash.", new BigDecimal("2.29")));
            products.add(new Product("Kohlrabi", "Vegetables", new BigDecimal("1.59"), "Mild and crunchy kohlrabi.", new BigDecimal("1.29")));
            products.add(new Product("Parsnip", "Vegetables", new BigDecimal("1.49"), "Sweet and nutty parsnips.", new BigDecimal("1.19")));
            products.add(new Product("Chard", "Vegetables", new BigDecimal("1.99"), "Leafy and colorful chard.", new BigDecimal("1.79")));
            products.add(new Product("Rutabaga", "Vegetables", new BigDecimal("1.69"), "Sweet and turnip-like rutabaga.", new BigDecimal("1.29")));

            // Seafood
            products.add(new Product("Salmon", "Seafood", new BigDecimal("9.99"), "Premium salmon fillet.", new BigDecimal("8.99")));
            products.add(new Product("Shrimp", "Seafood", new BigDecimal("7.49"), "Tasty and succulent shrimp.", new BigDecimal("6.99")));
            products.add(new Product("Tuna", "Seafood", new BigDecimal("6.99"), "Fresh and meaty tuna.", new BigDecimal("6.49")));
            products.add(new Product("Cod", "Seafood", new BigDecimal("8.29"), "Mild and flaky cod fillet.", new BigDecimal("7.79")));
            products.add(new Product("Lobster", "Seafood", new BigDecimal("15.99"), "Luxurious and tender lobster.", new BigDecimal("14.99")));
            products.add(new Product("Scallops", "Seafood", new BigDecimal("12.99"), "Delicate and sweet scallops.", new BigDecimal("11.99")));
            products.add(new Product("Crab", "Seafood", new BigDecimal("11.99"), "Crack and enjoy fresh crab.", new BigDecimal("10.99")));
            products.add(new Product("Mussels", "Seafood", new BigDecimal("6.99"), "Savory and plump mussels.", new BigDecimal("6.49")));
            products.add(new Product("Octopus", "Seafood", new BigDecimal("9.99"), "Tender and flavorful octopus.", new BigDecimal("8.99")));
            products.add(new Product("Clams", "Seafood", new BigDecimal("7.99"), "Tasty and briny clams.", new BigDecimal("7.49")));
            products.add(new Product("Squid", "Seafood", new BigDecimal("5.49"), "Versatile and tender squid.", new BigDecimal("4.99")));
            products.add(new Product("Crayfish", "Seafood", new BigDecimal("8.99"), "Small and delicious crayfish.", new BigDecimal("8.29")));
            products.add(new Product("Trout", "Seafood", new BigDecimal("7.99"), "Fresh and delicate trout.", new BigDecimal("7.49")));
            products.add(new Product("Barramundi", "Seafood", new BigDecimal("9.49"), "Australian sea bass with a mild flavor.", new BigDecimal("8.99")));
            products.add(new Product("Catfish", "Seafood", new BigDecimal("6.49"), "Whiskered and tasty catfish.", new BigDecimal("5.99")));
            products.add(new Product("Halibut", "Seafood", new BigDecimal("10.99"), "Lean and flaky halibut.", new BigDecimal("10.29")));
            products.add(new Product("Sardines", "Seafood", new BigDecimal("4.49"), "Small and flavorful sardines.", new BigDecimal("3.99")));
            products.add(new Product("Anchovies", "Seafood", new BigDecimal("3.99"), "Salty and oily anchovies.", new BigDecimal("3.49")));
            products.add(new Product("Tilapia", "Seafood", new BigDecimal("5.99"), "Mild and white tilapia.", new BigDecimal("5.49")));
            products.add(new Product("Rainbow Trout", "Seafood", new BigDecimal("8.99"), "Colorful and delicious rainbow trout.", new BigDecimal("8.29")));
            products.add(new Product("Striped Bass", "Seafood", new BigDecimal("9.99"), "Striped bass with a sweet flavor.", new BigDecimal("9.49")));
            products.add(new Product("Red Snapper", "Seafood", new BigDecimal("11.99"), "Delicate and red snapper fillet.", new BigDecimal("10.99")));
            products.add(new Product("Yellowfin Tuna", "Seafood", new BigDecimal("12.99"), "Yellowfin tuna with a rich flavor.", new BigDecimal("12.29")));
            products.add(new Product("Mahi Mahi", "Seafood", new BigDecimal("10.99"), "Mahi Mahi with a firm texture.", new BigDecimal("10.29")));
            products.add(new Product("Mackerel", "Seafood", new BigDecimal("6.99"), "Oily and nutritious mackerel.", new BigDecimal("6.49")));
            products.add(new Product("Haddock", "Seafood", new BigDecimal("7.99"), "Mild and flaky haddock fillet.", new BigDecimal("7.49")));
            products.add(new Product("Smoked Salmon", "Seafood", new BigDecimal("14.99"), "Smoked and savory salmon.", new BigDecimal("13.99")));
            products.add(new Product("Grouper", "Seafood", new BigDecimal("13.99"), "Grouper with a sweet and mild taste.", new BigDecimal("13.29")));

            // Pantry
            products.add(new Product("Pasta", "Pantry", new BigDecimal("1.49"), "Traditional pasta.", new BigDecimal("1.19")));
            products.add(new Product("Rice", "Pantry", new BigDecimal("2.79"), "Long-grain rice.", new BigDecimal("2.29")));
            products.add(new Product("Quinoa", "Pantry", new BigDecimal("3.99"), "Nutritious and versatile quinoa.", new BigDecimal("3.29")));
            products.add(new Product("Oats", "Pantry", new BigDecimal("1.99"), "Hearty and wholesome oats.", new BigDecimal("1.59")));
            products.add(new Product("Flour", "Pantry", new BigDecimal("2.49"), "All-purpose flour.", new BigDecimal("1.99")));
            products.add(new Product("Sugar", "Pantry", new BigDecimal("1.79"), "White granulated sugar.", new BigDecimal("1.49")));
            products.add(new Product("Honey", "Pantry", new BigDecimal("3.99"), "Natural and sweet honey.", new BigDecimal("3.29")));
            products.add(new Product("Olive Oil", "Pantry", new BigDecimal("4.49"), "Extra-virgin olive oil.", new BigDecimal("3.99")));
            products.add(new Product("Balsamic Vinegar", "Pantry", new BigDecimal("3.99"), "Aged balsamic vinegar.", new BigDecimal("3.49")));
            products.add(new Product("Soy Sauce", "Pantry", new BigDecimal("2.29"), "Savory and umami soy sauce.", new BigDecimal("1.99")));
            products.add(new Product("Peanut Butter", "Pantry", new BigDecimal("2.99"), "Creamy and nutty peanut butter.", new BigDecimal("2.49")));
            products.add(new Product("Jam", "Pantry", new BigDecimal("2.49"), "Sweet and fruity jam.", new BigDecimal("1.99")));
            products.add(new Product("Pasta Sauce", "Pantry", new BigDecimal("2.79"), "Rich and flavorful pasta sauce.", new BigDecimal("2.29")));
            products.add(new Product("Tomato Sauce", "Pantry", new BigDecimal("1.99"), "Classic tomato sauce.", new BigDecimal("1.49")));
            products.add(new Product("Canned Beans", "Pantry", new BigDecimal("1.49"), "Assorted canned beans.", new BigDecimal("1.19")));
            products.add(new Product("Canned Vegetables", "Pantry", new BigDecimal("1.99"), "Mixed canned vegetables.", new BigDecimal("1.59")));
            products.add(new Product("Canned Fruit", "Pantry", new BigDecimal("2.49"), "Assorted canned fruit.", new BigDecimal("1.99")));
            products.add(new Product("Canned Soup", "Pantry", new BigDecimal("2.29"), "Variety of canned soups.", new BigDecimal("1.99")));
            products.add(new Product("Chicken Broth", "Pantry", new BigDecimal("1.79"), "Flavorful chicken broth.", new BigDecimal("1.49")));
            products.add(new Product("Vegetable Broth", "Pantry", new BigDecimal("1.79"), "Savory vegetable broth.", new BigDecimal("1.49")));
            products.add(new Product("Instant Noodles", "Pantry", new BigDecimal("1.99"), "Quick and easy instant noodles.", new BigDecimal("1.49")));
            products.add(new Product("Instant Coffee", "Pantry", new BigDecimal("3.49"), "Convenient instant coffee.", new BigDecimal("2.99")));
            products.add(new Product("Tea Bags", "Pantry", new BigDecimal("2.49"), "Assorted tea bags.", new BigDecimal("1.99")));
            products.add(new Product("Hot Sauce", "Pantry", new BigDecimal("2.29"), "Fiery and spicy hot sauce.", new BigDecimal("1.99")));
            products.add(new Product("Mustard", "Pantry", new BigDecimal("1.79"), "Classic yellow mustard.", new BigDecimal("1.49")));
            products.add(new Product("Ketchup", "Pantry", new BigDecimal("1.99"), "Tangy and tomatoey ketchup.", new BigDecimal("1.49")));
            products.add(new Product("Cereal", "Pantry", new BigDecimal("3.99"), "Healthy cereal.", new BigDecimal("3.29")));
            products.add(new Product("Granola", "Pantry", new BigDecimal("3.49"), "Crunchy and wholesome granola.", new BigDecimal("2.99")));
            products.add(new Product("Breadcrumbs", "Pantry", new BigDecimal("1.49"), "Golden and crispy breadcrumbs.", new BigDecimal("1.19")));
            products.add(new Product("Coconut Milk", "Pantry", new BigDecimal("2.99"), "Creamy and coconutty milk.", new BigDecimal("2.49")));
            products.add(new Product("Almond Butter", "Pantry", new BigDecimal("4.49"), "Nutty and creamy almond butter.", new BigDecimal("3.99")));
            products.add(new Product("Chia Seeds", "Pantry", new BigDecimal("3.99"), "Nutritious and versatile chia seeds.", new BigDecimal("3.29")));

            // Breakfast
            products.add(new Product("Oatmeal", "Breakfast", new BigDecimal("2.49"), "Warm and comforting oatmeal.", new BigDecimal("1.99")));
            products.add(new Product("Pancake Mix", "Breakfast", new BigDecimal("2.99"), "Easy and fluffy pancake mix.", new BigDecimal("2.49")));
            products.add(new Product("Waffle Mix", "Breakfast", new BigDecimal("3.29"), "Delicious and crispy waffle mix.", new BigDecimal("2.79")));
            products.add(new Product("Maple Syrup", "Breakfast", new BigDecimal("3.99"), "Sweet and natural maple syrup.", new BigDecimal("3.29")));
            products.add(new Product("Breakfast Sausage", "Breakfast", new BigDecimal("3.49"), "Savory and flavorful breakfast sausage.", new BigDecimal("2.99")));
            products.add(new Product("Bacon", "Breakfast", new BigDecimal("4.99"), "Crispy and smoky bacon.", new BigDecimal("4.49")));
            products.add(new Product("Eggs", "Breakfast", new BigDecimal("2.29"), "Farm-fresh eggs.", new BigDecimal("1.99")));
            products.add(new Product("Cereal", "Breakfast", new BigDecimal("3.99"), "Healthy cereal.", new BigDecimal("3.29")));
            products.add(new Product("Milk", "Breakfast", new BigDecimal("2.49"), "Fresh and nutritious milk.", new BigDecimal("2.19")));
            products.add(new Product("Orange Juice", "Breakfast", new BigDecimal("2.99"), "Freshly squeezed orange juice.", new BigDecimal("2.49")));
            products.add(new Product("Apple Juice", "Breakfast", new BigDecimal("2.79"), "Sweet and refreshing apple juice.", new BigDecimal("2.29")));
            products.add(new Product("Grape Juice", "Breakfast", new BigDecimal("3.49"), "Juicy and rich grape juice.", new BigDecimal("2.99")));
            products.add(new Product("Coffee Beans", "Breakfast", new BigDecimal("5.99"), "Premium coffee beans.", new BigDecimal("5.49")));
            products.add(new Product("Tea Bags", "Breakfast", new BigDecimal("2.49"), "Assorted tea bags.", new BigDecimal("1.99")));
            products.add(new Product("Yogurt", "Breakfast", new BigDecimal("1.79"), "Creamy and delicious yogurt.", new BigDecimal("1.59")));
            products.add(new Product("Fresh Berries", "Breakfast", new BigDecimal("4.99"), "Plump and juicy fresh berries.", new BigDecimal("4.49")));
            products.add(new Product("Nutella", "Breakfast", new BigDecimal("3.99"), "Smooth and chocolatey Nutella spread.", new BigDecimal("3.49")));
            products.add(new Product("Peanut Butter", "Breakfast", new BigDecimal("2.99"), "Creamy and nutty peanut butter.", new BigDecimal("2.49")));
            products.add(new Product("Jam", "Breakfast", new BigDecimal("2.49"), "Sweet and fruity jam.", new BigDecimal("1.99")));
            products.add(new Product("Croissant", "Breakfast", new BigDecimal("1.79"), "Buttery and flaky croissant.", new BigDecimal("1.49")));
            products.add(new Product("Bagel", "Breakfast", new BigDecimal("1.99"), "Chewy and delicious bagel.", new BigDecimal("1.59")));
            products.add(new Product("Cinnamon Roll", "Breakfast", new BigDecimal("2.99"), "Sweet and gooey cinnamon roll.", new BigDecimal("2.49")));
            products.add(new Product("English Muffin", "Breakfast", new BigDecimal("1.49"), "Classic English muffin.", new BigDecimal("1.19")));
            products.add(new Product("Fruit Smoothie", "Breakfast", new BigDecimal("3.49"), "Refreshing and fruity smoothie.", new BigDecimal("2.99")));
            products.add(new Product("Greek Yogurt", "Breakfast", new BigDecimal("2.79"), "Thick and creamy Greek yogurt.", new BigDecimal("2.29")));
            products.add(new Product("Breakfast Burrito", "Breakfast", new BigDecimal("4.49"), "Hearty and satisfying breakfast burrito.", new BigDecimal("3.99")));
            products.add(new Product("Granola Bar", "Breakfast", new BigDecimal("1.99"), "Convenient and crunchy granola bar.", new BigDecimal("1.59")));
            products.add(new Product("Breakfast Cereal Bar", "Breakfast", new BigDecimal("1.79"), "On-the-go breakfast cereal bar.", new BigDecimal("1.29")));
            products.add(new Product("French Toast", "Breakfast", new BigDecimal("3.99"), "Golden and delicious French toast.", new BigDecimal("3.49")));

            // Beverages
            products.add(new Product("Water", "Beverages", new BigDecimal("0.99"), "Pure and refreshing bottled water.", new BigDecimal("0.79")));
            products.add(new Product("Sparkling Water", "Beverages", new BigDecimal("1.29"), "Bubbly and crisp sparkling water.", new BigDecimal("0.99")));
            products.add(new Product("Soda", "Beverages", new BigDecimal("1.99"), "Assorted soda flavors.", new BigDecimal("1.49")));
            products.add(new Product("Iced Tea", "Beverages", new BigDecimal("2.49"), "Cool and refreshing iced tea.", new BigDecimal("1.99")));
            products.add(new Product("Lemonade", "Beverages", new BigDecimal("2.29"), "Tangy and sweet lemonade.", new BigDecimal("1.79")));
            products.add(new Product("Orange Juice", "Beverages", new BigDecimal("2.99"), "Freshly squeezed orange juice.", new BigDecimal("2.49")));
            products.add(new Product("Apple Juice", "Beverages", new BigDecimal("2.79"), "Sweet and refreshing apple juice.", new BigDecimal("2.29")));
            products.add(new Product("Grape Juice", "Beverages", new BigDecimal("3.49"), "Juicy and rich grape juice.", new BigDecimal("2.99")));
            products.add(new Product("Cranberry Juice", "Beverages", new BigDecimal("2.99"), "Tart and flavorful cranberry juice.", new BigDecimal("2.49")));
            products.add(new Product("Pineapple Juice", "Beverages", new BigDecimal("2.79"), "Tropical and tangy pineapple juice.", new BigDecimal("2.29")));
            products.add(new Product("Coconut Water", "Beverages", new BigDecimal("2.49"), "Hydrating and natural coconut water.", new BigDecimal("1.99")));
            products.add(new Product("Almond Milk", "Beverages", new BigDecimal("3.49"), "Creamy and nutty almond milk.", new BigDecimal("2.99")));
            products.add(new Product("Soy Milk", "Beverages", new BigDecimal("2.99"), "Smooth and plant-based soy milk.", new BigDecimal("2.49")));
            products.add(new Product("Cashew Milk", "Beverages", new BigDecimal("3.99"), "Velvety and rich cashew milk.", new BigDecimal("3.29")));
            products.add(new Product("Chocolate Milk", "Beverages", new BigDecimal("2.49"), "Sweet and chocolatey milk.", new BigDecimal("1.99")));
            products.add(new Product("Hot Cocoa", "Beverages", new BigDecimal("2.79"), "Warm and comforting hot cocoa.", new BigDecimal("2.29")));
            products.add(new Product("Coffee Beans", "Beverages", new BigDecimal("5.99"), "Premium coffee beans.", new BigDecimal("5.49")));
            products.add(new Product("Ground Coffee", "Beverages", new BigDecimal("4.99"), "Convenient and ready-to-brew ground coffee.", new BigDecimal("4.49")));
            products.add(new Product("Instant Coffee", "Beverages", new BigDecimal("3.49"), "Convenient instant coffee.", new BigDecimal("2.99")));
            products.add(new Product("Tea Bags", "Beverages", new BigDecimal("2.49"), "Assorted tea bags.", new BigDecimal("1.99")));
            products.add(new Product("Green Tea", "Beverages", new BigDecimal("2.79"), "Light and refreshing green tea.", new BigDecimal("2.29")));
            products.add(new Product("Black Tea", "Beverages", new BigDecimal("2.79"), "Bold and classic black tea.", new BigDecimal("2.29")));
            products.add(new Product("Herbal Tea", "Beverages", new BigDecimal("2.99"), "Caffeine-free and soothing herbal tea.", new BigDecimal("2.49")));
            products.add(new Product("Chai Tea", "Beverages", new BigDecimal("2.99"), "Spiced and aromatic chai tea.", new BigDecimal("2.49")));
            products.add(new Product("Energy Drink", "Beverages", new BigDecimal("3.99"), "Boost of energy in a can.", new BigDecimal("3.29")));
            products.add(new Product("Sports Drink", "Beverages", new BigDecimal("2.49"), "Replenishing electrolytes in a bottle.", new BigDecimal("1.99")));
            products.add(new Product("Protein Shake", "Beverages", new BigDecimal("3.49"), "Nutritious and protein-packed shake.", new BigDecimal("2.99")));
            products.add(new Product("Smoothie", "Beverages", new BigDecimal("4.49"), "Fruity and refreshing smoothie.", new BigDecimal("3.99")));

            // Snacks
            products.add(new Product("Potato Chips", "Snacks", new BigDecimal("2.49"), "Classic and crunchy potato chips.", new BigDecimal("1.99")));
            products.add(new Product("Tortilla Chips", "Snacks", new BigDecimal("2.79"), "Crispy and flavorful tortilla chips.", new BigDecimal("2.29")));
            products.add(new Product("Pretzels", "Snacks", new BigDecimal("1.99"), "Salty and twisted pretzels.", new BigDecimal("1.49")));
            products.add(new Product("Popcorn", "Snacks", new BigDecimal("1.49"), "Buttery and addictive popcorn.", new BigDecimal("1.19")));
            products.add(new Product("Nuts", "Snacks", new BigDecimal("3.49"), "Assorted nuts - almonds, peanuts, cashews, etc.", new BigDecimal("2.99")));
            products.add(new Product("Trail Mix", "Snacks", new BigDecimal("3.99"), "Nutty and fruity trail mix.", new BigDecimal("3.29")));
            products.add(new Product("Granola Bars", "Snacks", new BigDecimal("1.99"), "Convenient and crunchy granola bars.", new BigDecimal("1.49")));
            products.add(new Product("Protein Bars", "Snacks", new BigDecimal("2.49"), "Nutritious and protein-packed bars.", new BigDecimal("1.99")));
            products.add(new Product("Cheese Crackers", "Snacks", new BigDecimal("2.99"), "Cheesy and crispy crackers.", new BigDecimal("2.49")));
            products.add(new Product("Rice Cakes", "Snacks", new BigDecimal("1.79"), "Light and crunchy rice cakes.", new BigDecimal("1.29")));
            products.add(new Product("Jerky", "Snacks", new BigDecimal("4.99"), "Savory and dried meat jerky.", new BigDecimal("4.49")));
            products.add(new Product("Dried Fruit", "Snacks", new BigDecimal("3.49"), "Sweet and chewy dried fruit.", new BigDecimal("2.99")));
            products.add(new Product("Fruit Snacks", "Snacks", new BigDecimal("2.29"), "Gummy and fruity fruit snacks.", new BigDecimal("1.99")));
            products.add(new Product("Chocolate Bar", "Snacks", new BigDecimal("2.49"), "Rich and indulgent chocolate bar.", new BigDecimal("1.99")));
            products.add(new Product("Gummy Candy", "Snacks", new BigDecimal("1.99"), "Chewy and fruity gummy candy.", new BigDecimal("1.49")));
            products.add(new Product("Hard Candy", "Snacks", new BigDecimal("1.79"), "Assorted hard candy flavors.", new BigDecimal("1.29")));
            products.add(new Product("Licorice", "Snacks", new BigDecimal("2.99"), "Sweet and chewy licorice candy.", new BigDecimal("2.49")));
            products.add(new Product("Chewing Gum", "Snacks", new BigDecimal("1.29"), "Minty and refreshing chewing gum.", new BigDecimal("0.99")));
            products.add(new Product("Cheese Puffs", "Snacks", new BigDecimal("1.99"), "Cheesy and airy cheese puffs.", new BigDecimal("1.49")));
            products.add(new Product("Crackers", "Snacks", new BigDecimal("1.49"), "Assorted crackers - salted, whole grain, etc.", new BigDecimal("1.19")));
            products.add(new Product("Marshmallows", "Snacks", new BigDecimal("1.79"), "Soft and fluffy marshmallows.", new BigDecimal("1.29")));
            products.add(new Product("Pita Chips", "Snacks", new BigDecimal("2.29"), "Crunchy and seasoned pita chips.", new BigDecimal("1.99")));
            products.add(new Product("Pork Rinds", "Snacks", new BigDecimal("1.99"), "Crispy and savory pork rinds.", new BigDecimal("1.49")));
            products.add(new Product("Seaweed Snacks", "Snacks", new BigDecimal("2.99"), "Crispy and umami seaweed snacks.", new BigDecimal("2.49")));
            products.add(new Product("Rice Crackers", "Snacks", new BigDecimal("1.99"), "Light and crunchy rice crackers.", new BigDecimal("1.49")));
            products.add(new Product("Vegetable Chips", "Snacks", new BigDecimal("2.49"), "Colorful and crispy vegetable chips.", new BigDecimal("1.99")));
            products.add(new Product("Nut Butter Cups", "Snacks", new BigDecimal("3.49"), "Indulgent and nutty butter cups.", new BigDecimal("2.99")));
            products.add(new Product("Raisins", "Snacks", new BigDecimal("1.29"), "Sweet and chewy raisins.", new BigDecimal("0.99")));
            products.add(new Product("Fruit Leather", "Snacks", new BigDecimal("2.29"), "Fruity and chewy fruit leather.", new BigDecimal("1.99")));
            products.add(new Product("Sesame Sticks", "Snacks", new BigDecimal("1.79"), "Crunchy and nutty sesame sticks.", new BigDecimal("1.29")));

            // Personal Care
            products.add(new Product("Shampoo", "Personal Care", new BigDecimal("5.99"), "Nourishing and cleansing shampoo.", new BigDecimal("5.49")));
            products.add(new Product("Conditioner", "Personal Care", new BigDecimal("5.99"), "Hydrating and smoothing conditioner.", new BigDecimal("5.49")));
            products.add(new Product("Body Wash", "Personal Care", new BigDecimal("4.99"), "Refreshing and cleansing body wash.", new BigDecimal("4.49")));
            products.add(new Product("Bar Soap", "Personal Care", new BigDecimal("2.99"), "Gentle and soothing bar soap.", new BigDecimal("2.49")));
            products.add(new Product("Toothpaste", "Personal Care", new BigDecimal("3.49"), "Minty and cavity-fighting toothpaste.", new BigDecimal("2.99")));
            products.add(new Product("Toothbrush", "Personal Care", new BigDecimal("2.49"), "Soft and effective toothbrush.", new BigDecimal("1.99")));
            products.add(new Product("Mouthwash", "Personal Care", new BigDecimal("3.99"), "Fresh and germ-fighting mouthwash.", new BigDecimal("3.29")));
            products.add(new Product("Deodorant", "Personal Care", new BigDecimal("4.49"), "Long-lasting and odor-fighting deodorant.", new BigDecimal("3.99")));
            products.add(new Product("Razors", "Personal Care", new BigDecimal("6.99"), "Sharp and durable razors.", new BigDecimal("6.49")));
            products.add(new Product("Shaving Cream", "Personal Care", new BigDecimal("3.49"), "Smooth and moisturizing shaving cream.", new BigDecimal("2.99")));
            products.add(new Product("Body Lotion", "Personal Care", new BigDecimal("5.49"), "Hydrating and silky body lotion.", new BigDecimal("4.99")));
            products.add(new Product("Hand Sanitizer", "Personal Care", new BigDecimal("2.99"), "Refreshing and germ-killing hand sanitizer.", new BigDecimal("2.49")));
            products.add(new Product("Sunscreen", "Personal Care", new BigDecimal("7.49"), "Protective and broad-spectrum sunscreen.", new BigDecimal("6.99")));
            products.add(new Product("Facial Cleanser", "Personal Care", new BigDecimal("4.99"), "Gentle and effective facial cleanser.", new BigDecimal("4.49")));
            products.add(new Product("Facial Moisturizer", "Personal Care", new BigDecimal("6.99"), "Hydrating and nourishing facial moisturizer.", new BigDecimal("6.49")));
            products.add(new Product("Makeup Remover", "Personal Care", new BigDecimal("3.99"), "Gentle and efficient makeup remover.", new BigDecimal("3.29")));
            products.add(new Product("Hand Soap", "Personal Care", new BigDecimal("3.49"), "Cleansing and moisturizing hand soap.", new BigDecimal("2.99")));
            products.add(new Product("Body Scrub", "Personal Care", new BigDecimal("5.99"), "Exfoliating and rejuvenating body scrub.", new BigDecimal("5.49")));
            products.add(new Product("Foot Cream", "Personal Care", new BigDecimal("4.49"), "Soothing and softening foot cream.", new BigDecimal("3.99")));
            products.add(new Product("Nail Clippers", "Personal Care", new BigDecimal("2.49"), "Sturdy and precise nail clippers.", new BigDecimal("1.99")));
            products.add(new Product("Cotton Swabs", "Personal Care", new BigDecimal("1.79"), "Versatile and soft cotton swabs.", new BigDecimal("1.29")));
            products.add(new Product("Cotton Balls", "Personal Care", new BigDecimal("1.49"), "Gentle and absorbent cotton balls.", new BigDecimal("0.99")));
            products.add(new Product("Facial Tissues", "Personal Care", new BigDecimal("1.99"), "Soft and strong facial tissues.", new BigDecimal("1.49")));
            products.add(new Product("Hair Gel", "Personal Care", new BigDecimal("4.49"), "Strong-hold and styling hair gel.", new BigDecimal("3.99")));
            products.add(new Product("Hair Spray", "Personal Care", new BigDecimal("3.99"), "Flexible-hold and volumizing hair spray.", new BigDecimal("3.49")));
            products.add(new Product("Hair Oil", "Personal Care", new BigDecimal("5.99"), "Nourishing and shine-enhancing hair oil.", new BigDecimal("5.49")));
            products.add(new Product("Hair Serum", "Personal Care", new BigDecimal("4.99"), "Smoothing and frizz-fighting hair serum.", new BigDecimal("4.49")));
            products.add(new Product("Hair Mask", "Personal Care", new BigDecimal("6.49"), "Restorative and repairing hair mask.", new BigDecimal("5.99")));
            products.add(new Product("Hair Dye", "Personal Care", new BigDecimal("7.99"), "Vibrant and long-lasting hair dye.", new BigDecimal("7.49")));
            products.add(new Product("Body Spray", "Personal Care", new BigDecimal("4.49"), "Fragrant and refreshing body spray.", new BigDecimal("3.99")));
            products.add(new Product("Nail Polish", "Personal Care", new BigDecimal("3.99"), "Assorted nail polish colors.", new BigDecimal("3.49")));
            products.add(new Product("Face Mask", "Personal Care", new BigDecimal("2.99"), "Soothing and hydrating face mask.", new BigDecimal("2.49")));
            products.add(new Product("Hair Brush", "Personal Care", new BigDecimal("4.99"), "Detangling and gentle hair brush.", new BigDecimal("4.49")));
            products.add(new Product("Hair Comb", "Personal Care", new BigDecimal("2.49"), "Fine-toothed and styling hair comb.", new BigDecimal("1.99")));
            products.add(new Product("Facial Wipes", "Personal Care", new BigDecimal("3.49"), "Convenient and cleansing facial wipes.", new BigDecimal("2.99")));
            products.add(new Product("Lip Balm", "Personal Care", new BigDecimal("1.99"), "Moisturizing and protective lip balm.", new BigDecimal("1.49")));
            products.add(new Product("Bath Bombs", "Personal Care", new BigDecimal("5.99"), "Fizzy and relaxing bath bombs.", new BigDecimal("5.49")));
            products.add(new Product("Sleep Mask", "Personal Care", new BigDecimal("3.49"), "Soft and light-blocking sleep mask.", new BigDecimal("2.99")));
            //Home and Kitchen
            products.add(new Product("Paper Towels", "Home and Kitchen", new BigDecimal("2.99"), "Absorbent and durable paper towels.", new BigDecimal("2.49")));
            products.add(new Product("Toilet Paper", "Home and Kitchen", new BigDecimal("3.99"), "Soft and reliable toilet paper.", new BigDecimal("3.29")));
            products.add(new Product("Trash Bags", "Home and Kitchen", new BigDecimal("3.49"), "Strong and tear-resistant trash bags.", new BigDecimal("2.99")));
            products.add(new Product("Aluminum Foil", "Home and Kitchen", new BigDecimal("2.49"), "Durable and versatile aluminum foil.", new BigDecimal("1.99")));
            products.add(new Product("Plastic Wrap", "Home and Kitchen", new BigDecimal("1.99"), "Stretchy and clingy plastic wrap.", new BigDecimal("1.49")));
            products.add(new Product("Food Storage Containers", "Home and Kitchen", new BigDecimal("5.49"), "Assorted food storage containers.", new BigDecimal("4.99")));
            products.add(new Product("Cutlery Set", "Home and Kitchen", new BigDecimal("8.99"), "Complete set of stainless steel cutlery.", new BigDecimal("8.49")));
            products.add(new Product("Cookware Set", "Home and Kitchen", new BigDecimal("49.99"), "Versatile and durable cookware set.", new BigDecimal("44.99")));
            products.add(new Product("Knife Set", "Home and Kitchen", new BigDecimal("19.99"), "Sharp and essential knife set.", new BigDecimal("17.99")));
            products.add(new Product("Cutting Board", "Home and Kitchen", new BigDecimal("6.99"), "Sturdy and easy-to-clean cutting board.", new BigDecimal("5.99")));
            products.add(new Product("Bakeware Set", "Home and Kitchen", new BigDecimal("29.99"), "Complete set of baking pans.", new BigDecimal("27.49")));
            products.add(new Product("Dish Rack", "Home and Kitchen", new BigDecimal("12.99"), "Compact and efficient dish rack.", new BigDecimal("11.49")));
            products.add(new Product("Food Processor", "Home and Kitchen", new BigDecimal("39.99"), "Multi-functional food processor.", new BigDecimal("34.99")));
            products.add(new Product("Blender", "Home and Kitchen", new BigDecimal("34.99"), "Powerful and versatile blender.", new BigDecimal("29.99")));
            products.add(new Product("Coffee Maker", "Home and Kitchen", new BigDecimal("29.99"), "Drip coffee maker.", new BigDecimal("24.99")));
            products.add(new Product("Toaster", "Home and Kitchen", new BigDecimal("19.99"), "Two-slice toaster.", new BigDecimal("16.99")));
            products.add(new Product("Microwave", "Home and Kitchen", new BigDecimal("79.99"), "Compact microwave oven.", new BigDecimal("74.99")));
            products.add(new Product("Rice Cooker", "Home and Kitchen", new BigDecimal("24.99"), "Automatic rice cooker.", new BigDecimal("21.99")));
            products.add(new Product("Electric Kettle", "Home and Kitchen", new BigDecimal("18.99"), "Fast-boiling electric kettle.", new BigDecimal("16.99")));
            products.add(new Product("Spatula", "Home and Kitchen", new BigDecimal("2.99"), "Heat-resistant spatula.", new BigDecimal("2.49")));
            products.add(new Product("Whisk", "Home and Kitchen", new BigDecimal("3.49"), "Stainless steel whisk.", new BigDecimal("2.99")));
            products.add(new Product("Can Opener", "Home and Kitchen", new BigDecimal("4.99"), "Sturdy can opener.", new BigDecimal("4.49")));
            products.add(new Product("Potato Peeler", "Home and Kitchen", new BigDecimal("2.49"), "Ergonomic potato peeler.", new BigDecimal("1.99")));
            products.add(new Product("Measuring Cups and Spoons", "Home and Kitchen", new BigDecimal("5.99"), "Set of measuring cups and spoons.", new BigDecimal("5.49")));
            products.add(new Product("Cooking Utensil Set", "Home and Kitchen", new BigDecimal("11.99"), "Complete set of cooking utensils.", new BigDecimal("10.49")));
            products.add(new Product("Dish Soap", "Home and Kitchen", new BigDecimal("2.29"), "Effective and grease-cutting dish soap.", new BigDecimal("1.99")));
            products.add(new Product("Dishwasher Detergent", "Home and Kitchen", new BigDecimal("5.99"), "Powerful and dishwasher-safe detergent.", new BigDecimal("5.49")));
            products.add(new Product("Laundry Detergent", "Home and Kitchen", new BigDecimal("8.49"), "Effective and gentle laundry detergent.", new BigDecimal("7.99")));
            products.add(new Product("Fabric Softener", "Home and Kitchen", new BigDecimal("4.99"), "Long-lasting fabric softener.", new BigDecimal("4.49")));
            products.add(new Product("Stain Remover", "Home and Kitchen", new BigDecimal("3.49"), "Effective and targeted stain remover.", new BigDecimal("2.99")));
            products.add(new Product("Garbage Disposal Cleaner", "Home and Kitchen", new BigDecimal("3.99"), "Deodorizing and garbage disposal cleaner.", new BigDecimal("3.49")));

            for (Product product : products) {
                productRepository.save(product);
            }
            System.out.println("Seeded: " + productRepository.count());
        }
    }
}

