# zoo-oop
## Problems with the proposed model
The main problem of the proposed model is that classes Lion, Cow, and Goat should inherit the Animal class. 
At the same time Cow, Goat, and Grass should be a Feed for other animals. As Java does not support multiple 
inheritances we can implement this feature with the help of interfaces and parametrization with generics. Also, we should follow the typical 
the Animal - Feed relation (the lion eats cows and goats but does not eat grass etc.).

## Alternative model
![Schema3](https://user-images.githubusercontent.com/92114777/168264501-118add85-ffb1-455f-b5c7-a7595d3d6817.png)




