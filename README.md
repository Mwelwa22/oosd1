# Car Parts and Accessories Shop 

A Java GUI-based application for managing stock items in a car parts and accessories shop.

## Project Structure

The project contains the following classes:

- **StockItem** - Base class representing a stock item in the shop
- **NavSys** - Subclass of StockItem representing a GeoVision Sat Nav
- **CarTyre** - Subclass of StockItem representing a car tyre
- **Dashcam** - Subclass of StockItem representing a dashcam
- **CarBattery** - Subclass of StockItem representing a car battery
- **ShopGUI** - GUI application for managing stock
- **TestNavSys** - Test class for NavSys functionality
- **TestPolymorphism** - Test class demonstrating polymorphism

## Setup Instructions

1. Make sure you have Java 17 installed
2. Open IntelliJ IDEA
3. Click File → Open and select the project folder
4. Make sure the SDK is set to Java 17
5. Navigate to the Assignment package

## How to Run

### GUI Application
- Run ShopGUI.java to launch the graphical interface

### Console Tests
- Run TestNavSys.java to test the NavSys class
- Run TestPolymorphism.java to test polymorphism with all subclasses

## Usage

1. Select the item type from the dropdown
2. Enter the stock code, quantity and price
3. Click Create Stock Item
4. Use the buttons to Add Stock, Sell Stock, Change Price or Display Item
