package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParZnbmndlhmbmx;
import cn.ibizlab.ehr.webapi.dto.ParZnbmndlhmbmxDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParZnbmndlhmbmxMappingImpl implements ParZnbmndlhmbmxMapping {

    @Override
    public ParZnbmndlhmbmx toDomain(ParZnbmndlhmbmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParZnbmndlhmbmx parZnbmndlhmbmx = new ParZnbmndlhmbmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parZnbmndlhmbmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parZnbmndlhmbmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhzq() != null ) {
            parZnbmndlhmbmx.setKhzq( dto.getKhzq() );
        }
        if ( dto.getXgrz() != null ) {
            parZnbmndlhmbmx.setXgrz( dto.getXgrz() );
        }
        if ( dto.getMblx() != null ) {
            parZnbmndlhmbmx.setMblx( dto.getMblx() );
        }
        if ( dto.getSpzt() != null ) {
            parZnbmndlhmbmx.setSpzt( dto.getSpzt() );
        }
        if ( dto.getWcqk() != null ) {
            parZnbmndlhmbmx.setWcqk( dto.getWcqk() );
        }
        if ( dto.getFzqz() != null ) {
            parZnbmndlhmbmx.setFzqz( dto.getFzqz() );
        }
        if ( dto.getZt() != null ) {
            parZnbmndlhmbmx.setZt( dto.getZt() );
        }
        if ( dto.getZpfs() != null ) {
            parZnbmndlhmbmx.setZpfs( dto.getZpfs() );
        }
        if ( dto.getKhbz() != null ) {
            parZnbmndlhmbmx.setKhbz( dto.getKhbz() );
        }
        if ( dto.getParznbmndlhmbmxname() != null ) {
            parZnbmndlhmbmx.setParznbmndlhmbmxname( dto.getParznbmndlhmbmxname() );
        }
        if ( dto.getZmcl() != null ) {
            parZnbmndlhmbmx.setZmcl( dto.getZmcl() );
        }
        if ( dto.getMblhyq() != null ) {
            parZnbmndlhmbmx.setMblhyq( dto.getMblhyq() );
        }
        if ( dto.getParznbmndlhmbid() != null ) {
            parZnbmndlhmbmx.setParznbmndlhmbid( dto.getParznbmndlhmbid() );
        }
        if ( dto.getParznbmndlhmbmxid() != null ) {
            parZnbmndlhmbmx.setParznbmndlhmbmxid( dto.getParznbmndlhmbmxid() );
        }
        if ( dto.getUpdateman() != null ) {
            parZnbmndlhmbmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parZnbmndlhmbmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            parZnbmndlhmbmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parZnbmndlhmbmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getParznbmndlhmbname() != null ) {
            parZnbmndlhmbmx.setParznbmndlhmbname( dto.getParznbmndlhmbname() );
        }

        return parZnbmndlhmbmx;
    }

    @Override
    public ParZnbmndlhmbmxDTO toDto(ParZnbmndlhmbmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParZnbmndlhmbmxDTO parZnbmndlhmbmxDTO = new ParZnbmndlhmbmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parZnbmndlhmbmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parZnbmndlhmbmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhzq() != null ) {
            parZnbmndlhmbmxDTO.setKhzq( entity.getKhzq() );
        }
        if ( entity.getXgrz() != null ) {
            parZnbmndlhmbmxDTO.setXgrz( entity.getXgrz() );
        }
        if ( entity.getMblx() != null ) {
            parZnbmndlhmbmxDTO.setMblx( entity.getMblx() );
        }
        if ( entity.getSpzt() != null ) {
            parZnbmndlhmbmxDTO.setSpzt( entity.getSpzt() );
        }
        if ( entity.getWcqk() != null ) {
            parZnbmndlhmbmxDTO.setWcqk( entity.getWcqk() );
        }
        if ( entity.getFzqz() != null ) {
            parZnbmndlhmbmxDTO.setFzqz( entity.getFzqz() );
        }
        if ( entity.getZt() != null ) {
            parZnbmndlhmbmxDTO.setZt( entity.getZt() );
        }
        if ( entity.getZpfs() != null ) {
            parZnbmndlhmbmxDTO.setZpfs( entity.getZpfs() );
        }
        if ( entity.getKhbz() != null ) {
            parZnbmndlhmbmxDTO.setKhbz( entity.getKhbz() );
        }
        if ( entity.getParznbmndlhmbmxname() != null ) {
            parZnbmndlhmbmxDTO.setParznbmndlhmbmxname( entity.getParznbmndlhmbmxname() );
        }
        if ( entity.getZmcl() != null ) {
            parZnbmndlhmbmxDTO.setZmcl( entity.getZmcl() );
        }
        if ( entity.getMblhyq() != null ) {
            parZnbmndlhmbmxDTO.setMblhyq( entity.getMblhyq() );
        }
        if ( entity.getParznbmndlhmbid() != null ) {
            parZnbmndlhmbmxDTO.setParznbmndlhmbid( entity.getParznbmndlhmbid() );
        }
        if ( entity.getParznbmndlhmbmxid() != null ) {
            parZnbmndlhmbmxDTO.setParznbmndlhmbmxid( entity.getParznbmndlhmbmxid() );
        }
        if ( entity.getUpdateman() != null ) {
            parZnbmndlhmbmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parZnbmndlhmbmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            parZnbmndlhmbmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parZnbmndlhmbmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getParznbmndlhmbname() != null ) {
            parZnbmndlhmbmxDTO.setParznbmndlhmbname( entity.getParznbmndlhmbname() );
        }

        return parZnbmndlhmbmxDTO;
    }

    @Override
    public List<ParZnbmndlhmbmx> toDomain(List<ParZnbmndlhmbmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParZnbmndlhmbmx> list = new ArrayList<ParZnbmndlhmbmx>( dtoList.size() );
        for ( ParZnbmndlhmbmxDTO parZnbmndlhmbmxDTO : dtoList ) {
            list.add( toDomain( parZnbmndlhmbmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParZnbmndlhmbmxDTO> toDto(List<ParZnbmndlhmbmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParZnbmndlhmbmxDTO> list = new ArrayList<ParZnbmndlhmbmxDTO>( entityList.size() );
        for ( ParZnbmndlhmbmx parZnbmndlhmbmx : entityList ) {
            list.add( toDto( parZnbmndlhmbmx ) );
        }

        return list;
    }
}
