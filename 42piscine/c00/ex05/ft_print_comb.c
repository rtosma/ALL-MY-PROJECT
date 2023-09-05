/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_print_comb.c                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: rosma <42kocaeli.com.tr>                   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/07/13 16:00:49 by rosma             #+#    #+#             */
/*   Updated: 2023/07/13 18:01:10 by rosma            ###   ########.tr       */
/*                                                                            */
/* ************************************************************************** */

#include <unistd.h>
#include <stdbool.h>

void	ft_putchar(char value)
{
	write(1, &value, 1);
}

void	ft_result(char x, char y, char z)
{
	bool	last_char;

	ft_putchar(x);
	ft_putchar(y);
	ft_putchar(z);
	last_char = !(x == '7' && y == '8' && z == '9');
	if (last_char)
	{
		ft_putchar(',');
		ft_putchar(' ');
	}
}

void	ft_print_comb(void)
{
	char	x;
	char	y;
	char	z;

	x = '0';
	while (x <= '7')
	{
		y = x + 1;
		while (y <= '8' )
		{
			z = y + 1;
			while (z <= '9')
			{
				ft_result (x, y, z);
				z++;
			}
			y++;
		}
		x++;
	}
}
