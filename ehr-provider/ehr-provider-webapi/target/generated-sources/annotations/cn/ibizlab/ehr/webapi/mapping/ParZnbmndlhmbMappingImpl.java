package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParZnbmndlhmb;
import cn.ibizlab.ehr.webapi.dto.ParZnbmndlhmbDTO;
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
public class ParZnbmndlhmbMappingImpl implements ParZnbmndlhmbMapping {

    @Override
    public ParZnbmndlhmb toDomain(ParZnbmndlhmbDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParZnbmndlhmb parZnbmndlhmb = new ParZnbmndlhmb();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parZnbmndlhmb.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parZnbmndlhmb.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSstz() != null ) {
            parZnbmndlhmb.setSstz( dto.getSstz() );
        }
        if ( dto.getNd() != null ) {
            parZnbmndlhmb.setNd( dto.getNd() );
        }
        if ( dto.getParznbmndlhmbname() != null ) {
            parZnbmndlhmb.setParznbmndlhmbname( dto.getParznbmndlhmbname() );
        }
        if ( dto.getBmfzr() != null ) {
            parZnbmndlhmb.setBmfzr( dto.getBmfzr() );
        }
        if ( dto.getXh() != null ) {
            parZnbmndlhmb.setXh( dto.getXh() );
        }
        if ( dto.getJxjd() != null ) {
            parZnbmndlhmb.setJxjd( dto.getJxjd() );
        }
        if ( dto.getMc() != null ) {
            parZnbmndlhmb.setMc( dto.getMc() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            parZnbmndlhmb.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            parZnbmndlhmb.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parZnbmndlhmb.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parZnbmndlhmb.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            parZnbmndlhmb.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParznbmndlhmbid() != null ) {
            parZnbmndlhmb.setParznbmndlhmbid( dto.getParznbmndlhmbid() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            parZnbmndlhmb.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getSsorg() != null ) {
            parZnbmndlhmb.setSsorg( dto.getSsorg() );
        }

        return parZnbmndlhmb;
    }

    @Override
    public ParZnbmndlhmbDTO toDto(ParZnbmndlhmb entity) {
        if ( entity == null ) {
            return null;
        }

        ParZnbmndlhmbDTO parZnbmndlhmbDTO = new ParZnbmndlhmbDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parZnbmndlhmbDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parZnbmndlhmbDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSstz() != null ) {
            parZnbmndlhmbDTO.setSstz( entity.getSstz() );
        }
        if ( entity.getNd() != null ) {
            parZnbmndlhmbDTO.setNd( entity.getNd() );
        }
        if ( entity.getParznbmndlhmbname() != null ) {
            parZnbmndlhmbDTO.setParznbmndlhmbname( entity.getParznbmndlhmbname() );
        }
        if ( entity.getBmfzr() != null ) {
            parZnbmndlhmbDTO.setBmfzr( entity.getBmfzr() );
        }
        if ( entity.getXh() != null ) {
            parZnbmndlhmbDTO.setXh( entity.getXh() );
        }
        if ( entity.getJxjd() != null ) {
            parZnbmndlhmbDTO.setJxjd( entity.getJxjd() );
        }
        if ( entity.getMc() != null ) {
            parZnbmndlhmbDTO.setMc( entity.getMc() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            parZnbmndlhmbDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            parZnbmndlhmbDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parZnbmndlhmbDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parZnbmndlhmbDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            parZnbmndlhmbDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParznbmndlhmbid() != null ) {
            parZnbmndlhmbDTO.setParznbmndlhmbid( entity.getParznbmndlhmbid() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            parZnbmndlhmbDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getSsorg() != null ) {
            parZnbmndlhmbDTO.setSsorg( entity.getSsorg() );
        }

        return parZnbmndlhmbDTO;
    }

    @Override
    public List<ParZnbmndlhmb> toDomain(List<ParZnbmndlhmbDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParZnbmndlhmb> list = new ArrayList<ParZnbmndlhmb>( dtoList.size() );
        for ( ParZnbmndlhmbDTO parZnbmndlhmbDTO : dtoList ) {
            list.add( toDomain( parZnbmndlhmbDTO ) );
        }

        return list;
    }

    @Override
    public List<ParZnbmndlhmbDTO> toDto(List<ParZnbmndlhmb> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParZnbmndlhmbDTO> list = new ArrayList<ParZnbmndlhmbDTO>( entityList.size() );
        for ( ParZnbmndlhmb parZnbmndlhmb : entityList ) {
            list.add( toDto( parZnbmndlhmb ) );
        }

        return list;
    }
}
