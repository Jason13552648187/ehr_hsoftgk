package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimArchivesChange;
import cn.ibizlab.ehr.webapi.dto.PimArchivesChangeDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimArchivesChangeMappingImpl implements PimArchivesChangeMapping {

    @Override
    public PimArchivesChange toDomain(PimArchivesChangeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimArchivesChange pimArchivesChange = new PimArchivesChange();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimArchivesChange.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimArchivesChange.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimarchiveschangename() != null ) {
            pimArchivesChange.setPimarchiveschangename( dto.getPimarchiveschangename() );
        }
        if ( dto.getDazt() != null ) {
            pimArchivesChange.setDazt( dto.getDazt() );
        }
        if ( dto.getDcdw() != null ) {
            pimArchivesChange.setDcdw( dto.getDcdw() );
        }
        if ( dto.getDdjltype() != null ) {
            pimArchivesChange.setDdjltype( dto.getDdjltype() );
        }
        if ( dto.getBz() != null ) {
            pimArchivesChange.setBz( dto.getBz() );
        }
        if ( dto.getXgdbgd() != null ) {
            pimArchivesChange.setXgdbgd( dto.getXgdbgd() );
        }
        if ( dto.getJlcssj() != null ) {
            pimArchivesChange.setJlcssj( dto.getJlcssj() );
        }
        if ( dto.getDrdw() != null ) {
            pimArchivesChange.setDrdw( dto.getDrdw() );
        }
        if ( dto.getDaddrq() != null ) {
            pimArchivesChange.setDaddrq( dto.getDaddrq() );
        }
        if ( dto.getOrmorgname2() != null ) {
            pimArchivesChange.setOrmorgname2( dto.getOrmorgname2() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimArchivesChange.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmorgid2() != null ) {
            pimArchivesChange.setOrmorgid2( dto.getOrmorgid2() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimArchivesChange.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimarchivesid() != null ) {
            pimArchivesChange.setPimarchivesid( dto.getPimarchivesid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimArchivesChange.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimArchivesChange.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimArchivesChange.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimArchivesChange.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimArchivesChange.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimarchiveschangeid() != null ) {
            pimArchivesChange.setPimarchiveschangeid( dto.getPimarchiveschangeid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimArchivesChange.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getPimarchivesname() != null ) {
            pimArchivesChange.setPimarchivesname( dto.getPimarchivesname() );
        }
        if ( dto.getYgbh() != null ) {
            pimArchivesChange.setYgbh( dto.getYgbh() );
        }

        return pimArchivesChange;
    }

    @Override
    public PimArchivesChangeDTO toDto(PimArchivesChange entity) {
        if ( entity == null ) {
            return null;
        }

        PimArchivesChangeDTO pimArchivesChangeDTO = new PimArchivesChangeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimArchivesChangeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimArchivesChangeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimarchiveschangename() != null ) {
            pimArchivesChangeDTO.setPimarchiveschangename( entity.getPimarchiveschangename() );
        }
        if ( entity.getDazt() != null ) {
            pimArchivesChangeDTO.setDazt( entity.getDazt() );
        }
        if ( entity.getDcdw() != null ) {
            pimArchivesChangeDTO.setDcdw( entity.getDcdw() );
        }
        if ( entity.getDdjltype() != null ) {
            pimArchivesChangeDTO.setDdjltype( entity.getDdjltype() );
        }
        if ( entity.getBz() != null ) {
            pimArchivesChangeDTO.setBz( entity.getBz() );
        }
        if ( entity.getXgdbgd() != null ) {
            pimArchivesChangeDTO.setXgdbgd( entity.getXgdbgd() );
        }
        if ( entity.getJlcssj() != null ) {
            pimArchivesChangeDTO.setJlcssj( entity.getJlcssj() );
        }
        if ( entity.getDrdw() != null ) {
            pimArchivesChangeDTO.setDrdw( entity.getDrdw() );
        }
        if ( entity.getDaddrq() != null ) {
            pimArchivesChangeDTO.setDaddrq( entity.getDaddrq() );
        }
        if ( entity.getOrmorgname2() != null ) {
            pimArchivesChangeDTO.setOrmorgname2( entity.getOrmorgname2() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimArchivesChangeDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmorgid2() != null ) {
            pimArchivesChangeDTO.setOrmorgid2( entity.getOrmorgid2() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimArchivesChangeDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimarchivesid() != null ) {
            pimArchivesChangeDTO.setPimarchivesid( entity.getPimarchivesid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimArchivesChangeDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimArchivesChangeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimArchivesChangeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimArchivesChangeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimArchivesChangeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimarchiveschangeid() != null ) {
            pimArchivesChangeDTO.setPimarchiveschangeid( entity.getPimarchiveschangeid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimArchivesChangeDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getPimarchivesname() != null ) {
            pimArchivesChangeDTO.setPimarchivesname( entity.getPimarchivesname() );
        }
        if ( entity.getYgbh() != null ) {
            pimArchivesChangeDTO.setYgbh( entity.getYgbh() );
        }

        return pimArchivesChangeDTO;
    }

    @Override
    public List<PimArchivesChange> toDomain(List<PimArchivesChangeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimArchivesChange> list = new ArrayList<PimArchivesChange>( dtoList.size() );
        for ( PimArchivesChangeDTO pimArchivesChangeDTO : dtoList ) {
            list.add( toDomain( pimArchivesChangeDTO ) );
        }

        return list;
    }

    @Override
    public List<PimArchivesChangeDTO> toDto(List<PimArchivesChange> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimArchivesChangeDTO> list = new ArrayList<PimArchivesChangeDTO>( entityList.size() );
        for ( PimArchivesChange pimArchivesChange : entityList ) {
            list.add( toDto( pimArchivesChange ) );
        }

        return list;
    }
}
