package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParLdndlhmb;
import cn.ibizlab.ehr.webapi.dto.ParLdndlhmbDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParLdndlhmbMappingImpl implements ParLdndlhmbMapping {

    @Override
    public ParLdndlhmb toDomain(ParLdndlhmbDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParLdndlhmb parLdndlhmb = new ParLdndlhmb();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parLdndlhmb.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parLdndlhmb.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParldndlhmbname() != null ) {
            parLdndlhmb.setParldndlhmbname( dto.getParldndlhmbname() );
        }
        if ( dto.getSstz() != null ) {
            parLdndlhmb.setSstz( dto.getSstz() );
        }
        if ( dto.getSszz() != null ) {
            parLdndlhmb.setSszz( dto.getSszz() );
        }
        if ( dto.getNd() != null ) {
            parLdndlhmb.setNd( dto.getNd() );
        }
        if ( dto.getSsbm() != null ) {
            parLdndlhmb.setSsbm( dto.getSsbm() );
        }
        if ( dto.getJxjd() != null ) {
            parLdndlhmb.setJxjd( dto.getJxjd() );
        }
        if ( dto.getXh() != null ) {
            parLdndlhmb.setXh( dto.getXh() );
        }
        if ( dto.getPimpersonid() != null ) {
            parLdndlhmb.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreatedate() != null ) {
            parLdndlhmb.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parLdndlhmb.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParldndlhmbid() != null ) {
            parLdndlhmb.setParldndlhmbid( dto.getParldndlhmbid() );
        }
        if ( dto.getCreateman() != null ) {
            parLdndlhmb.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parLdndlhmb.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            parLdndlhmb.setPimpersonname( dto.getPimpersonname() );
        }

        return parLdndlhmb;
    }

    @Override
    public ParLdndlhmbDTO toDto(ParLdndlhmb entity) {
        if ( entity == null ) {
            return null;
        }

        ParLdndlhmbDTO parLdndlhmbDTO = new ParLdndlhmbDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parLdndlhmbDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parLdndlhmbDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParldndlhmbname() != null ) {
            parLdndlhmbDTO.setParldndlhmbname( entity.getParldndlhmbname() );
        }
        if ( entity.getSstz() != null ) {
            parLdndlhmbDTO.setSstz( entity.getSstz() );
        }
        if ( entity.getSszz() != null ) {
            parLdndlhmbDTO.setSszz( entity.getSszz() );
        }
        if ( entity.getNd() != null ) {
            parLdndlhmbDTO.setNd( entity.getNd() );
        }
        if ( entity.getSsbm() != null ) {
            parLdndlhmbDTO.setSsbm( entity.getSsbm() );
        }
        if ( entity.getJxjd() != null ) {
            parLdndlhmbDTO.setJxjd( entity.getJxjd() );
        }
        if ( entity.getXh() != null ) {
            parLdndlhmbDTO.setXh( entity.getXh() );
        }
        if ( entity.getPimpersonid() != null ) {
            parLdndlhmbDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreatedate() != null ) {
            parLdndlhmbDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parLdndlhmbDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParldndlhmbid() != null ) {
            parLdndlhmbDTO.setParldndlhmbid( entity.getParldndlhmbid() );
        }
        if ( entity.getCreateman() != null ) {
            parLdndlhmbDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parLdndlhmbDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            parLdndlhmbDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return parLdndlhmbDTO;
    }

    @Override
    public List<ParLdndlhmb> toDomain(List<ParLdndlhmbDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParLdndlhmb> list = new ArrayList<ParLdndlhmb>( dtoList.size() );
        for ( ParLdndlhmbDTO parLdndlhmbDTO : dtoList ) {
            list.add( toDomain( parLdndlhmbDTO ) );
        }

        return list;
    }

    @Override
    public List<ParLdndlhmbDTO> toDto(List<ParLdndlhmb> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParLdndlhmbDTO> list = new ArrayList<ParLdndlhmbDTO>( entityList.size() );
        for ( ParLdndlhmb parLdndlhmb : entityList ) {
            list.add( toDto( parLdndlhmb ) );
        }

        return list;
    }
}
