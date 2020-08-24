program HelloWorld
    implicit none
    real :: opp, hyp, sine_theta
    print *,'Enter the hypotenuse and side opposite to angle: '
    read (*,*) hyp,opp 
    sine_theta = opp / hyp
    print *,'The sine of the given angle is: ', sine_theta
end program
