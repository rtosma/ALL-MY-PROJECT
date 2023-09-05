/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_sqrt.c                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: rosma <osmatayyip@gmail.com>               +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/07/31 15:27:44 by zayerden          #+#    #+#             */
/*   Updated: 2023/08/03 00:28:17 by rosma            ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

int	ft_sqrt(int nb)
{
	unsigned int	i;
	unsigned int	number;

	if (nb < 0)
		return (0);
	i = 0;
	number = (unsigned int)nb;
	while (i * i <= number)
	{
		if (i * i == number)
			return (i);
		i++;
	}
	return (0);
}
