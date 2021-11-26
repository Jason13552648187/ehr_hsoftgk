package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimArchiveSloanandreturn;
import cn.ibizlab.ehr.webapi.dto.PimArchiveSloanandreturnDTO;
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
public class PimArchiveSloanandreturnMappingImpl implements PimArchiveSloanandreturnMapping {

    @Override
    public PimArchiveSloanandreturn toDomain(PimArchiveSloanandreturnDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimArchiveSloanandreturn pimArchiveSloanandreturn = new PimArchiveSloanandreturn();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimArchiveSloanandreturn.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimArchiveSloanandreturn.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJyr() != null ) {
            pimArchiveSloanandreturn.setJyr( dto.getJyr() );
        }
        if ( dto.getSpdate() != null ) {
            pimArchiveSloanandreturn.setSpdate( dto.getSpdate() );
        }
        if ( dto.getJyyy() != null ) {
            pimArchiveSloanandreturn.setJyyy( dto.getJyyy() );
        }
        if ( dto.getGhrq() != null ) {
            pimArchiveSloanandreturn.setGhrq( dto.getGhrq() );
        }
        if ( dto.getZt() != null ) {
            pimArchiveSloanandreturn.setZt( dto.getZt() );
        }
        if ( dto.getJyqssj() != null ) {
            pimArchiveSloanandreturn.setJyqssj( dto.getJyqssj() );
        }
        if ( dto.getPimarchivesloanandreturnname() != null ) {
            pimArchiveSloanandreturn.setPimarchivesloanandreturnname( dto.getPimarchivesloanandreturnname() );
        }
        if ( dto.getSpperson() != null ) {
            pimArchiveSloanandreturn.setSpperson( dto.getSpperson() );
        }
        if ( dto.getPimpersonname3() != null ) {
            pimArchiveSloanandreturn.setPimpersonname3( dto.getPimpersonname3() );
        }
        if ( dto.getPimpersonid3() != null ) {
            pimArchiveSloanandreturn.setPimpersonid3( dto.getPimpersonid3() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimArchiveSloanandreturn.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPimarchivesid() != null ) {
            pimArchiveSloanandreturn.setPimarchivesid( dto.getPimarchivesid() );
        }
        if ( dto.getPimpersonid2() != null ) {
            pimArchiveSloanandreturn.setPimpersonid2( dto.getPimpersonid2() );
        }
        if ( dto.getCreateman() != null ) {
            pimArchiveSloanandreturn.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            pimArchiveSloanandreturn.setEnable( dto.getEnable() );
        }
        if ( dto.getPimarchivesloanandreturnid() != null ) {
            pimArchiveSloanandreturn.setPimarchivesloanandreturnid( dto.getPimarchivesloanandreturnid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimArchiveSloanandreturn.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimArchiveSloanandreturn.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimArchiveSloanandreturn.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimarchivesname() != null ) {
            pimArchiveSloanandreturn.setPimarchivesname( dto.getPimarchivesname() );
        }
        if ( dto.getPimpersonname2() != null ) {
            pimArchiveSloanandreturn.setPimpersonname2( dto.getPimpersonname2() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimArchiveSloanandreturn.setPimpersonname( dto.getPimpersonname() );
        }

        return pimArchiveSloanandreturn;
    }

    @Override
    public PimArchiveSloanandreturnDTO toDto(PimArchiveSloanandreturn entity) {
        if ( entity == null ) {
            return null;
        }

        PimArchiveSloanandreturnDTO pimArchiveSloanandreturnDTO = new PimArchiveSloanandreturnDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimArchiveSloanandreturnDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimArchiveSloanandreturnDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJyr() != null ) {
            pimArchiveSloanandreturnDTO.setJyr( entity.getJyr() );
        }
        if ( entity.getSpdate() != null ) {
            pimArchiveSloanandreturnDTO.setSpdate( entity.getSpdate() );
        }
        if ( entity.getJyyy() != null ) {
            pimArchiveSloanandreturnDTO.setJyyy( entity.getJyyy() );
        }
        if ( entity.getGhrq() != null ) {
            pimArchiveSloanandreturnDTO.setGhrq( entity.getGhrq() );
        }
        if ( entity.getZt() != null ) {
            pimArchiveSloanandreturnDTO.setZt( entity.getZt() );
        }
        if ( entity.getJyqssj() != null ) {
            pimArchiveSloanandreturnDTO.setJyqssj( entity.getJyqssj() );
        }
        if ( entity.getPimarchivesloanandreturnname() != null ) {
            pimArchiveSloanandreturnDTO.setPimarchivesloanandreturnname( entity.getPimarchivesloanandreturnname() );
        }
        if ( entity.getSpperson() != null ) {
            pimArchiveSloanandreturnDTO.setSpperson( entity.getSpperson() );
        }
        if ( entity.getPimpersonname3() != null ) {
            pimArchiveSloanandreturnDTO.setPimpersonname3( entity.getPimpersonname3() );
        }
        if ( entity.getPimpersonid3() != null ) {
            pimArchiveSloanandreturnDTO.setPimpersonid3( entity.getPimpersonid3() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimArchiveSloanandreturnDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPimarchivesid() != null ) {
            pimArchiveSloanandreturnDTO.setPimarchivesid( entity.getPimarchivesid() );
        }
        if ( entity.getPimpersonid2() != null ) {
            pimArchiveSloanandreturnDTO.setPimpersonid2( entity.getPimpersonid2() );
        }
        if ( entity.getCreateman() != null ) {
            pimArchiveSloanandreturnDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            pimArchiveSloanandreturnDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPimarchivesloanandreturnid() != null ) {
            pimArchiveSloanandreturnDTO.setPimarchivesloanandreturnid( entity.getPimarchivesloanandreturnid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimArchiveSloanandreturnDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimArchiveSloanandreturnDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimArchiveSloanandreturnDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimarchivesname() != null ) {
            pimArchiveSloanandreturnDTO.setPimarchivesname( entity.getPimarchivesname() );
        }
        if ( entity.getPimpersonname2() != null ) {
            pimArchiveSloanandreturnDTO.setPimpersonname2( entity.getPimpersonname2() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimArchiveSloanandreturnDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pimArchiveSloanandreturnDTO;
    }

    @Override
    public List<PimArchiveSloanandreturn> toDomain(List<PimArchiveSloanandreturnDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimArchiveSloanandreturn> list = new ArrayList<PimArchiveSloanandreturn>( dtoList.size() );
        for ( PimArchiveSloanandreturnDTO pimArchiveSloanandreturnDTO : dtoList ) {
            list.add( toDomain( pimArchiveSloanandreturnDTO ) );
        }

        return list;
    }

    @Override
    public List<PimArchiveSloanandreturnDTO> toDto(List<PimArchiveSloanandreturn> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimArchiveSloanandreturnDTO> list = new ArrayList<PimArchiveSloanandreturnDTO>( entityList.size() );
        for ( PimArchiveSloanandreturn pimArchiveSloanandreturn : entityList ) {
            list.add( toDto( pimArchiveSloanandreturn ) );
        }

        return list;
    }
}
