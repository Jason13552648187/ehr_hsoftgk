package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParPtryndlhmb;
import cn.ibizlab.ehr.webapi.dto.ParPtryndlhmbDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParPtryndlhmbMappingImpl implements ParPtryndlhmbMapping {

    @Override
    public ParPtryndlhmb toDomain(ParPtryndlhmbDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParPtryndlhmb parPtryndlhmb = new ParPtryndlhmb();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parPtryndlhmb.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parPtryndlhmb.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNd() != null ) {
            parPtryndlhmb.setNd( dto.getNd() );
        }
        if ( dto.getJxjd() != null ) {
            parPtryndlhmb.setJxjd( dto.getJxjd() );
        }
        if ( dto.getSsbm() != null ) {
            parPtryndlhmb.setSsbm( dto.getSsbm() );
        }
        if ( dto.getSstz() != null ) {
            parPtryndlhmb.setSstz( dto.getSstz() );
        }
        if ( dto.getSszz() != null ) {
            parPtryndlhmb.setSszz( dto.getSszz() );
        }
        if ( dto.getXh() != null ) {
            parPtryndlhmb.setXh( dto.getXh() );
        }
        if ( dto.getParptryndlhmbname() != null ) {
            parPtryndlhmb.setParptryndlhmbname( dto.getParptryndlhmbname() );
        }
        if ( dto.getPimpersonid() != null ) {
            parPtryndlhmb.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            parPtryndlhmb.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parPtryndlhmb.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parPtryndlhmb.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getParptryndlhmbid() != null ) {
            parPtryndlhmb.setParptryndlhmbid( dto.getParptryndlhmbid() );
        }
        if ( dto.getUpdateman() != null ) {
            parPtryndlhmb.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimpersonname() != null ) {
            parPtryndlhmb.setPimpersonname( dto.getPimpersonname() );
        }

        return parPtryndlhmb;
    }

    @Override
    public ParPtryndlhmbDTO toDto(ParPtryndlhmb entity) {
        if ( entity == null ) {
            return null;
        }

        ParPtryndlhmbDTO parPtryndlhmbDTO = new ParPtryndlhmbDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parPtryndlhmbDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parPtryndlhmbDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNd() != null ) {
            parPtryndlhmbDTO.setNd( entity.getNd() );
        }
        if ( entity.getJxjd() != null ) {
            parPtryndlhmbDTO.setJxjd( entity.getJxjd() );
        }
        if ( entity.getSsbm() != null ) {
            parPtryndlhmbDTO.setSsbm( entity.getSsbm() );
        }
        if ( entity.getSstz() != null ) {
            parPtryndlhmbDTO.setSstz( entity.getSstz() );
        }
        if ( entity.getSszz() != null ) {
            parPtryndlhmbDTO.setSszz( entity.getSszz() );
        }
        if ( entity.getXh() != null ) {
            parPtryndlhmbDTO.setXh( entity.getXh() );
        }
        if ( entity.getParptryndlhmbname() != null ) {
            parPtryndlhmbDTO.setParptryndlhmbname( entity.getParptryndlhmbname() );
        }
        if ( entity.getPimpersonid() != null ) {
            parPtryndlhmbDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            parPtryndlhmbDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parPtryndlhmbDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parPtryndlhmbDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getParptryndlhmbid() != null ) {
            parPtryndlhmbDTO.setParptryndlhmbid( entity.getParptryndlhmbid() );
        }
        if ( entity.getUpdateman() != null ) {
            parPtryndlhmbDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimpersonname() != null ) {
            parPtryndlhmbDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return parPtryndlhmbDTO;
    }

    @Override
    public List<ParPtryndlhmb> toDomain(List<ParPtryndlhmbDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParPtryndlhmb> list = new ArrayList<ParPtryndlhmb>( dtoList.size() );
        for ( ParPtryndlhmbDTO parPtryndlhmbDTO : dtoList ) {
            list.add( toDomain( parPtryndlhmbDTO ) );
        }

        return list;
    }

    @Override
    public List<ParPtryndlhmbDTO> toDto(List<ParPtryndlhmb> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParPtryndlhmbDTO> list = new ArrayList<ParPtryndlhmbDTO>( entityList.size() );
        for ( ParPtryndlhmb parPtryndlhmb : entityList ) {
            list.add( toDto( parPtryndlhmb ) );
        }

        return list;
    }
}
