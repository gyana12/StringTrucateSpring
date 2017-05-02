# StringTrucateSpring
Question 1

Consider the following Spring controller:

@Controller

public​ class​ SubscriptionController {

...

@RequestMapping(value = "/subscribe", method = RequestMethod.GET​)

public​ String subscribe(HttpServletRequest request) {

...

String orderDetails = getOrderDetails(request);

String truncatedOrderDetails = truncate(orderDetails, 250);

log(truncatedOrderDetails);

...

}

...

}

The order details returned is a string of all the information required to create an order. The problem is that

parts of this string (e.g. the terms and conditions) could be very large, and we don’t want to fill up the logs

with this information.

Write the truncate() method, that will take a string and remove the middle portion so that the resulting

string has a length equal to the given number of characters. This method will put the string "...

(truncated) ... " in the middle of the given string to replace the text that was there. It will never make

the string longer than the original.

The truncate method will take two parameters:

1. The original string

2. The total number of characters that are allowed in the result

Write as many interfaces and classes as you need - think about your design​ - and assume they are already

injected into the controller.

You can use any commonly available java library that you like.

Please include the controller class as part of your answer to demonstrate how it will interact with your

solution.

Examples:

Method call:

truncate("123456789012345678901234567890", 25)

Result:

"12 ... (truncated) ... 90"

Reason:

Here, there are 30 characters. Since a maximum of 25 characters is specified, this method will

remove enough characters such that the resulting string only has 25 characters in the result.

Method call:

truncate("1234567890", 5)

Result:

"1234567890"

Reason:

In this case, there is no way to restrict the number of characters to 5. Since putting "...

(truncated) ... " will make the string larger than 10 characters, this call will not change the

input.

Method call:

truncate("123456789012345678901234567890", 31)

Result:

"123456789012345678901234567890"

Reason:

In this case, the number of characters is less than 31, so this call will not change the input.
