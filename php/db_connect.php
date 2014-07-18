<?php
$db=mysqli_connect ("localhost", “#######”, “########”);
if($db == false) 
{ 
   die(mysqli_connect_error()); 
}
mysqli_select_db ("tannercr_bloglog");


mysqli_close($db);

echo "finished";


?>