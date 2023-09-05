/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_is_prime.c                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zayerden <zayerden@student.42kocaeli.co    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/07/31 15:50:00 by zayerden          #+#    #+#             */
/*   Updated: 2023/08/01 10:49:42 by zayerden         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

int	ft_is_prime( int nb )
{
	unsigned int	i;
	unsigned int	number;

	if (nb < 2)
		return (0);
	i = 2;
	number = nb;
	while (i * i <= number)
		if (nb % i++ == 0)
			return (0);
	return (1);
}
