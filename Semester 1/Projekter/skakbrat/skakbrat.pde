size(500,600);

for (int i=0; i<8; i++){
  for (int j=0; j<8; j++){

   if ((i + j + 1)%2==0) {
       fill(255);
   } else {
     fill(0);
   }



   square(i*50, j*50, 50);
  }
}
