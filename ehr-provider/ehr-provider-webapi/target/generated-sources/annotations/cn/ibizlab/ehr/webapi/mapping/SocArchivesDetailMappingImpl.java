package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocArchivesDetail;
import cn.ibizlab.ehr.webapi.dto.SocArchivesDetailDTO;
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
public class SocArchivesDetailMappingImpl implements SocArchivesDetailMapping {

    @Override
    public SocArchivesDetail toDomain(SocArchivesDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocArchivesDetail socArchivesDetail = new SocArchivesDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socArchivesDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socArchivesDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSocarchivesdetailname() != null ) {
            socArchivesDetail.setSocarchivesdetailname( dto.getSocarchivesdetailname() );
        }
        if ( dto.getSocarchivesid() != null ) {
            socArchivesDetail.setSocarchivesid( dto.getSocarchivesid() );
        }
        if ( dto.getSocruledetailid() != null ) {
            socArchivesDetail.setSocruledetailid( dto.getSocruledetailid() );
        }
        if ( dto.getPersonnum() != null ) {
            socArchivesDetail.setPersonnum( dto.getPersonnum() );
        }
        if ( dto.getCompanynum() != null ) {
            socArchivesDetail.setCompanynum( dto.getCompanynum() );
        }
        if ( dto.getSocarchivesdetailid() != null ) {
            socArchivesDetail.setSocarchivesdetailid( dto.getSocarchivesdetailid() );
        }
        if ( dto.getCreateman() != null ) {
            socArchivesDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            socArchivesDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            socArchivesDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            socArchivesDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSocarchivesname() != null ) {
            socArchivesDetail.setSocarchivesname( dto.getSocarchivesname() );
        }
        if ( dto.getHighnum() != null ) {
            socArchivesDetail.setHighnum( dto.getHighnum() );
        }
        if ( dto.getLownum() != null ) {
            socArchivesDetail.setLownum( dto.getLownum() );
        }
        if ( dto.getOrdervalue() != null ) {
            socArchivesDetail.setOrdervalue( dto.getOrdervalue() );
        }
        if ( dto.getSoctypeid() != null ) {
            socArchivesDetail.setSoctypeid( dto.getSoctypeid() );
        }
        if ( dto.getSoctypename() != null ) {
            socArchivesDetail.setSoctypename( dto.getSoctypename() );
        }
        if ( dto.getPersonrate() != null ) {
            socArchivesDetail.setPersonrate( dto.getPersonrate() );
        }
        if ( dto.getCompanyrate() != null ) {
            socArchivesDetail.setCompanyrate( dto.getCompanyrate() );
        }
        if ( dto.getPersonamount() != null ) {
            socArchivesDetail.setPersonamount( dto.getPersonamount() );
        }
        if ( dto.getCompanyamount() != null ) {
            socArchivesDetail.setCompanyamount( dto.getCompanyamount() );
        }
        if ( dto.getSocruledetailname() != null ) {
            socArchivesDetail.setSocruledetailname( dto.getSocruledetailname() );
        }

        return socArchivesDetail;
    }

    @Override
    public SocArchivesDetailDTO toDto(SocArchivesDetail entity) {
        if ( entity == null ) {
            return null;
        }

        SocArchivesDetailDTO socArchivesDetailDTO = new SocArchivesDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socArchivesDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socArchivesDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSocarchivesdetailname() != null ) {
            socArchivesDetailDTO.setSocarchivesdetailname( entity.getSocarchivesdetailname() );
        }
        if ( entity.getSocarchivesid() != null ) {
            socArchivesDetailDTO.setSocarchivesid( entity.getSocarchivesid() );
        }
        if ( entity.getSocruledetailid() != null ) {
            socArchivesDetailDTO.setSocruledetailid( entity.getSocruledetailid() );
        }
        if ( entity.getPersonnum() != null ) {
            socArchivesDetailDTO.setPersonnum( entity.getPersonnum() );
        }
        if ( entity.getCompanynum() != null ) {
            socArchivesDetailDTO.setCompanynum( entity.getCompanynum() );
        }
        if ( entity.getSocarchivesdetailid() != null ) {
            socArchivesDetailDTO.setSocarchivesdetailid( entity.getSocarchivesdetailid() );
        }
        if ( entity.getCreateman() != null ) {
            socArchivesDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            socArchivesDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            socArchivesDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            socArchivesDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSocarchivesname() != null ) {
            socArchivesDetailDTO.setSocarchivesname( entity.getSocarchivesname() );
        }
        if ( entity.getHighnum() != null ) {
            socArchivesDetailDTO.setHighnum( entity.getHighnum() );
        }
        if ( entity.getLownum() != null ) {
            socArchivesDetailDTO.setLownum( entity.getLownum() );
        }
        if ( entity.getOrdervalue() != null ) {
            socArchivesDetailDTO.setOrdervalue( entity.getOrdervalue() );
        }
        if ( entity.getSoctypeid() != null ) {
            socArchivesDetailDTO.setSoctypeid( entity.getSoctypeid() );
        }
        if ( entity.getSoctypename() != null ) {
            socArchivesDetailDTO.setSoctypename( entity.getSoctypename() );
        }
        if ( entity.getPersonrate() != null ) {
            socArchivesDetailDTO.setPersonrate( entity.getPersonrate() );
        }
        if ( entity.getCompanyrate() != null ) {
            socArchivesDetailDTO.setCompanyrate( entity.getCompanyrate() );
        }
        if ( entity.getPersonamount() != null ) {
            socArchivesDetailDTO.setPersonamount( entity.getPersonamount() );
        }
        if ( entity.getCompanyamount() != null ) {
            socArchivesDetailDTO.setCompanyamount( entity.getCompanyamount() );
        }
        if ( entity.getSocruledetailname() != null ) {
            socArchivesDetailDTO.setSocruledetailname( entity.getSocruledetailname() );
        }

        return socArchivesDetailDTO;
    }

    @Override
    public List<SocArchivesDetail> toDomain(List<SocArchivesDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocArchivesDetail> list = new ArrayList<SocArchivesDetail>( dtoList.size() );
        for ( SocArchivesDetailDTO socArchivesDetailDTO : dtoList ) {
            list.add( toDomain( socArchivesDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<SocArchivesDetailDTO> toDto(List<SocArchivesDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocArchivesDetailDTO> list = new ArrayList<SocArchivesDetailDTO>( entityList.size() );
        for ( SocArchivesDetail socArchivesDetail : entityList ) {
            list.add( toDto( socArchivesDetail ) );
        }

        return list;
    }
}
