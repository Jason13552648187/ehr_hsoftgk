package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimExpaccount;
import cn.ibizlab.ehr.webapi.dto.PimExpaccountDTO;
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
public class PimExpaccountMappingImpl implements PimExpaccountMapping {

    @Override
    public PimExpaccount toDomain(PimExpaccountDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimExpaccount pimExpaccount = new PimExpaccount();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimExpaccount.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimExpaccount.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFfsj() != null ) {
            pimExpaccount.setFfsj( dto.getFfsj() );
        }
        if ( dto.getFfrs() != null ) {
            pimExpaccount.setFfrs( dto.getFfrs() );
        }
        if ( dto.getFyje() != null ) {
            pimExpaccount.setFyje( dto.getFyje() );
        }
        if ( dto.getPimexpaccountname() != null ) {
            pimExpaccount.setPimexpaccountname( dto.getPimexpaccountname() );
        }
        if ( dto.getFfybz() != null ) {
            pimExpaccount.setFfybz( dto.getFfybz() );
        }
        if ( dto.getBz() != null ) {
            pimExpaccount.setBz( dto.getBz() );
        }
        if ( dto.getFylb() != null ) {
            pimExpaccount.setFylb( dto.getFylb() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimExpaccount.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrgid() != null ) {
            pimExpaccount.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimExpaccount.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimExpaccount.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimExpaccount.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimexpaccountid() != null ) {
            pimExpaccount.setPimexpaccountid( dto.getPimexpaccountid() );
        }
        if ( dto.getCreateman() != null ) {
            pimExpaccount.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimExpaccount.setOrmorgname( dto.getOrmorgname() );
        }

        return pimExpaccount;
    }

    @Override
    public PimExpaccountDTO toDto(PimExpaccount entity) {
        if ( entity == null ) {
            return null;
        }

        PimExpaccountDTO pimExpaccountDTO = new PimExpaccountDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimExpaccountDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimExpaccountDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFfsj() != null ) {
            pimExpaccountDTO.setFfsj( entity.getFfsj() );
        }
        if ( entity.getFfrs() != null ) {
            pimExpaccountDTO.setFfrs( entity.getFfrs() );
        }
        if ( entity.getFyje() != null ) {
            pimExpaccountDTO.setFyje( entity.getFyje() );
        }
        if ( entity.getPimexpaccountname() != null ) {
            pimExpaccountDTO.setPimexpaccountname( entity.getPimexpaccountname() );
        }
        if ( entity.getFfybz() != null ) {
            pimExpaccountDTO.setFfybz( entity.getFfybz() );
        }
        if ( entity.getBz() != null ) {
            pimExpaccountDTO.setBz( entity.getBz() );
        }
        if ( entity.getFylb() != null ) {
            pimExpaccountDTO.setFylb( entity.getFylb() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimExpaccountDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrgid() != null ) {
            pimExpaccountDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimExpaccountDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimExpaccountDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimExpaccountDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimexpaccountid() != null ) {
            pimExpaccountDTO.setPimexpaccountid( entity.getPimexpaccountid() );
        }
        if ( entity.getCreateman() != null ) {
            pimExpaccountDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimExpaccountDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pimExpaccountDTO;
    }

    @Override
    public List<PimExpaccount> toDomain(List<PimExpaccountDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimExpaccount> list = new ArrayList<PimExpaccount>( dtoList.size() );
        for ( PimExpaccountDTO pimExpaccountDTO : dtoList ) {
            list.add( toDomain( pimExpaccountDTO ) );
        }

        return list;
    }

    @Override
    public List<PimExpaccountDTO> toDto(List<PimExpaccount> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimExpaccountDTO> list = new ArrayList<PimExpaccountDTO>( entityList.size() );
        for ( PimExpaccount pimExpaccount : entityList ) {
            list.add( toDto( pimExpaccount ) );
        }

        return list;
    }
}
