/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strupcase.c                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: rosma <42kocaeli.com.tr>                   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/07/25 14:43:18 by rosma             #+#    #+#             */
/*   Updated: 2023/07/25 14:51:24 by rosma            ###   ########.tr       */
/*                                                                            */
/* ************************************************************************** */

char	*ft_strupcase(char *str)
{
	int	k;

	k = 0;
	while (str[k] != '\0')
	{
		if (str[k] >= 'a' && str[k] <= 'z')
		{
			str[k] -= 32;
		}
		k++;
	}
	return (str);
}
